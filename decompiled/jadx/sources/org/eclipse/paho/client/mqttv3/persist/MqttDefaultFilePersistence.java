package org.eclipse.paho.client.mqttv3.persist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.internal.FileLock;
import org.eclipse.paho.client.mqttv3.internal.MqttPersistentData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MqttDefaultFilePersistence implements MqttClientPersistence {
    private static FilenameFilter FILENAME_FILTER = null;
    private static final String LOCK_FILENAME = ".lck";
    private static final String MESSAGE_BACKUP_FILE_EXTENSION = ".bup";
    private static final String MESSAGE_FILE_EXTENSION = ".msg";
    private File clientDir;
    private File dataDir;
    private FileLock fileLock;

    public MqttDefaultFilePersistence(String str) {
        this.clientDir = null;
        this.fileLock = null;
        this.dataDir = new File(str);
    }

    private void checkIsOpen() throws MqttPersistenceException {
        if (this.clientDir == null) {
            throw new MqttPersistenceException();
        }
    }

    private static FilenameFilter getFilenameFilter() {
        if (FILENAME_FILTER == null) {
            FILENAME_FILTER = new PersistanceFileNameFilter(MESSAGE_FILE_EXTENSION);
        }
        return FILENAME_FILTER;
    }

    private File[] getFiles() throws MqttPersistenceException {
        checkIsOpen();
        File[] listFiles = this.clientDir.listFiles(getFilenameFilter());
        if (listFiles != null) {
            return listFiles;
        }
        throw new MqttPersistenceException();
    }

    private boolean isSafeChar(char c) {
        return Character.isJavaIdentifierPart(c) || c == '-';
    }

    private void restoreBackups(File file) throws MqttPersistenceException {
        File[] listFiles = file.listFiles(new PersistanceFileFilter(MESSAGE_BACKUP_FILE_EXTENSION));
        if (listFiles == null) {
            throw new MqttPersistenceException();
        }
        for (File file2 : listFiles) {
            File file3 = new File(file, file2.getName().substring(0, file2.getName().length() - 4));
            if (!file2.renameTo(file3)) {
                file3.delete();
                file2.renameTo(file3);
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void clear() throws MqttPersistenceException {
        checkIsOpen();
        for (File file : getFiles()) {
            file.delete();
        }
        this.clientDir.delete();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence, java.lang.AutoCloseable
    public void close() throws MqttPersistenceException {
        synchronized (this) {
            try {
                FileLock fileLock = this.fileLock;
                if (fileLock != null) {
                    fileLock.release();
                }
                if (getFiles().length == 0) {
                    this.clientDir.delete();
                }
                this.clientDir = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public boolean containsKey(String str) throws MqttPersistenceException {
        checkIsOpen();
        return new File(this.clientDir, String.valueOf(str).concat(MESSAGE_FILE_EXTENSION)).exists();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public MqttPersistable get(String str) throws MqttPersistenceException {
        checkIsOpen();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.clientDir, String.valueOf(str).concat(MESSAGE_FILE_EXTENSION)));
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            int i = 0;
            while (i < available) {
                String str2 = str;
                i += fileInputStream.read(bArr, i, available - i);
                str = str2;
            }
            fileInputStream.close();
            return new MqttPersistentData(str, bArr, 0, available, null, 0, 0);
        } catch (IOException e) {
            throw new MqttPersistenceException(e);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public Enumeration<String> keys() throws MqttPersistenceException {
        checkIsOpen();
        File[] files = getFiles();
        Vector vector = new Vector(files.length);
        for (File file : files) {
            vector.addElement(file.getName().substring(0, r4.length() - 4));
        }
        return vector.elements();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void open(String str, String str2) throws MqttPersistenceException {
        if (this.dataDir.exists() && !this.dataDir.isDirectory()) {
            throw new MqttPersistenceException();
        }
        if (!this.dataDir.exists() && !this.dataDir.mkdirs()) {
            throw new MqttPersistenceException();
        }
        if (!this.dataDir.canWrite()) {
            throw new MqttPersistenceException();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (isSafeChar(charAt)) {
                stringBuffer.append(charAt);
            }
        }
        stringBuffer.append("-");
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char charAt2 = str2.charAt(i2);
            if (isSafeChar(charAt2)) {
                stringBuffer.append(charAt2);
            }
        }
        synchronized (this) {
            if (this.clientDir == null) {
                File file = new File(this.dataDir, stringBuffer.toString());
                this.clientDir = file;
                if (!file.exists()) {
                    this.clientDir.mkdir();
                }
            }
            try {
                FileLock fileLock = this.fileLock;
                if (fileLock != null) {
                    fileLock.release();
                }
                this.fileLock = new FileLock(this.clientDir, LOCK_FILENAME);
            } catch (Exception unused) {
            }
            restoreBackups(this.clientDir);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
        checkIsOpen();
        File file = new File(this.clientDir, String.valueOf(str).concat(MESSAGE_FILE_EXTENSION));
        File file2 = new File(this.clientDir, String.valueOf(str).concat(".msg.bup"));
        if (file.exists() && !file.renameTo(file2)) {
            file2.delete();
            file.renameTo(file2);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength());
                if (mqttPersistable.getPayloadBytes() != null) {
                    fileOutputStream.write(mqttPersistable.getPayloadBytes(), mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file2.exists() || file2.renameTo(file)) {
                    return;
                }
                file.delete();
                file2.renameTo(file);
            } catch (IOException e) {
                throw new MqttPersistenceException(e);
            }
        } catch (Throwable th) {
            if (file2.exists() && !file2.renameTo(file)) {
                file.delete();
                file2.renameTo(file);
            }
            throw th;
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void remove(String str) throws MqttPersistenceException {
        checkIsOpen();
        File file = new File(this.clientDir, String.valueOf(str).concat(MESSAGE_FILE_EXTENSION));
        if (file.exists()) {
            file.delete();
        }
    }

    public MqttDefaultFilePersistence() {
        this(System.getProperty("user.dir"));
    }
}
