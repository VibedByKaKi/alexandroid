package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ObservableInputStream extends ProxyInputStream {
    private final List<Observer> observers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Observer {
        public void data(byte[] bArr, int i, int i2) throws IOException {
        }

        public void closed() throws IOException {
        }

        public void finished() throws IOException {
        }

        public void data(int i) throws IOException {
        }

        public void error(IOException iOException) throws IOException {
            throw iOException;
        }
    }

    public ObservableInputStream(InputStream inputStream) {
        this(inputStream, new ArrayList());
    }

    private void notify(byte[] bArr, int i, int i2, IOException iOException) throws IOException {
        if (iOException != null) {
            noteError(iOException);
            throw iOException;
        }
        if (i2 == -1) {
            noteFinished();
        } else if (i2 > 0) {
            noteDataBytes(bArr, i, i2);
        }
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() throws IOException {
        while (read(IOUtils.byteArray()) != -1) {
        }
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void noteClosed() throws IOException {
        Iterator<Observer> it2 = getObservers().iterator();
        while (it2.hasNext()) {
            it2.next().closed();
        }
    }

    public void noteDataByte(int i) throws IOException {
        Iterator<Observer> it2 = getObservers().iterator();
        while (it2.hasNext()) {
            it2.next().data(i);
        }
    }

    public void noteDataBytes(byte[] bArr, int i, int i2) throws IOException {
        Iterator<Observer> it2 = getObservers().iterator();
        while (it2.hasNext()) {
            it2.next().data(bArr, i, i2);
        }
    }

    public void noteError(IOException iOException) throws IOException {
        Iterator<Observer> it2 = getObservers().iterator();
        while (it2.hasNext()) {
            it2.next().error(iOException);
        }
    }

    public void noteFinished() throws IOException {
        Iterator<Observer> it2 = getObservers().iterator();
        while (it2.hasNext()) {
            it2.next().finished();
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        try {
            i = super.read();
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (e != null) {
            noteError(e);
            throw e;
        }
        if (i == -1) {
            noteFinished();
        } else {
            noteDataByte(i);
        }
        return i;
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void removeAllObservers() {
        this.observers.clear();
    }

    private ObservableInputStream(InputStream inputStream, List<Observer> list) {
        super(inputStream);
        this.observers = list;
    }

    public ObservableInputStream(InputStream inputStream, Observer... observerArr) {
        this(inputStream, (List<Observer>) Arrays.asList(observerArr));
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i;
        try {
            i = super.read(bArr);
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        notify(bArr, 0, i, e);
        return i;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        try {
            i3 = super.read(bArr, i, i2);
            e = null;
        } catch (IOException e) {
            e = e;
            i3 = 0;
        }
        notify(bArr, i, i3, e);
        return i3;
    }
}
