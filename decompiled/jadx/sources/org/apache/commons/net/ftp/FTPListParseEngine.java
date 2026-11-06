package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.net.util.Charsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FTPListParseEngine {
    private static final FTPFile[] EMPTY_FTP_FILE_ARRAY = new FTPFile[0];
    private List<String> entries;
    private ListIterator<String> internalIterator;
    private final FTPFileEntryParser parser;
    private final boolean saveUnparseableEntries;

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser, FTPClientConfig fTPClientConfig) {
        LinkedList linkedList = new LinkedList();
        this.entries = linkedList;
        this.internalIterator = linkedList.listIterator();
        this.parser = fTPFileEntryParser;
        if (fTPClientConfig != null) {
            this.saveUnparseableEntries = fTPClientConfig.getUnparseableEntries();
        } else {
            this.saveUnparseableEntries = false;
        }
    }

    private void read(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.toCharset(str)));
        try {
            String readNextEntry = this.parser.readNextEntry(bufferedReader);
            while (readNextEntry != null) {
                this.entries.add(readNextEntry);
                readNextEntry = this.parser.readNextEntry(bufferedReader);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public FTPFile[] getFiles(FTPFileFilter fTPFileFilter) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String str : this.entries) {
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(str);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(str);
            }
            if (fTPFileFilter.accept(parseFTPEntry)) {
                arrayList.add(parseFTPEntry);
            }
        }
        return (FTPFile[]) arrayList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public FTPFile[] getNext(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this.internalIterator.hasNext()) {
            String next = this.internalIterator.next();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(next);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(next);
            }
            linkedList.add(parseFTPEntry);
            i--;
        }
        return (FTPFile[]) linkedList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public FTPFile[] getPrevious(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this.internalIterator.hasPrevious()) {
            String previous = this.internalIterator.previous();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(previous);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(previous);
            }
            linkedList.add(0, parseFTPEntry);
            i--;
        }
        return (FTPFile[]) linkedList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    public boolean hasPrevious() {
        return this.internalIterator.hasPrevious();
    }

    public void readServerList(InputStream inputStream, String str) throws IOException {
        this.entries = new LinkedList();
        read(inputStream, str);
        this.parser.preParse(this.entries);
        resetIterator();
    }

    public void resetIterator() {
        this.internalIterator = this.entries.listIterator();
    }

    @Deprecated
    public void readServerList(InputStream inputStream) throws IOException {
        readServerList(inputStream, null);
    }

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser) {
        this(fTPFileEntryParser, null);
    }

    public FTPFile[] getFiles() throws IOException {
        return getFiles(FTPFileFilters.NON_NULL);
    }
}
