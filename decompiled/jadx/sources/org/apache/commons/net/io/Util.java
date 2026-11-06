package org.apache.commons.net.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Util {
    public static final int DEFAULT_COPY_BUFFER_SIZE = 1024;

    private Util() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copyReader(Reader reader, Writer writer, int i, long j, CopyStreamListener copyStreamListener) throws CopyStreamException {
        IOException iOException;
        if (i <= 0) {
            i = 1024;
        }
        char[] cArr = new char[i];
        long j2 = 0;
        while (true) {
            try {
                int read = reader.read(cArr);
                if (read == -1) {
                    break;
                }
                if (read == 0) {
                    int read2 = reader.read();
                    if (read2 < 0) {
                        break;
                    }
                    writer.write(read2);
                    writer.flush();
                    long j3 = j2 + 1;
                    if (copyStreamListener != null) {
                        try {
                            copyStreamListener.bytesTransferred(j3, 1, j);
                        } catch (IOException e) {
                            iOException = e;
                            j2 = j3;
                            throw new CopyStreamException("IOException caught while copying.", j2, iOException);
                        }
                    }
                    j2 = j3;
                } else {
                    writer.write(cArr, 0, read);
                    writer.flush();
                    long j4 = j2 + read;
                    if (copyStreamListener != null) {
                        try {
                            copyStreamListener.bytesTransferred(j4, read, j);
                        } catch (IOException e2) {
                            iOException = e2;
                            j2 = j4;
                            throw new CopyStreamException("IOException caught while copying.", j2, iOException);
                        }
                    }
                    j2 = j4;
                }
            } catch (IOException e3) {
                iOException = e3;
            }
        }
        return j2;
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, int i, long j, CopyStreamListener copyStreamListener, boolean z) throws CopyStreamException {
        IOException iOException;
        if (i <= 0) {
            i = 1024;
        }
        byte[] bArr = new byte[i];
        long j2 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (read == 0) {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        break;
                    }
                    outputStream.write(read2);
                    if (z) {
                        outputStream.flush();
                    }
                    long j3 = j2 + 1;
                    if (copyStreamListener != null) {
                        try {
                            copyStreamListener.bytesTransferred(j3, 1, j);
                        } catch (IOException e) {
                            iOException = e;
                            j2 = j3;
                            throw new CopyStreamException("IOException caught while copying.", j2, iOException);
                        }
                    }
                    j2 = j3;
                } else {
                    outputStream.write(bArr, 0, read);
                    if (z) {
                        outputStream.flush();
                    }
                    long j4 = j2 + read;
                    if (copyStreamListener != null) {
                        try {
                            copyStreamListener.bytesTransferred(j4, read, j);
                        } catch (IOException e2) {
                            iOException = e2;
                            j2 = j4;
                            throw new CopyStreamException("IOException caught while copying.", j2, iOException);
                        }
                    }
                    j2 = j4;
                }
            } catch (IOException e3) {
                iOException = e3;
            }
        }
        return j2;
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copyReader(Reader reader, Writer writer, int i) throws CopyStreamException {
        return copyReader(reader, writer, i, -1L, null);
    }

    public static long copyReader(Reader reader, Writer writer) throws CopyStreamException {
        return copyReader(reader, writer, 1024);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, int i, long j, CopyStreamListener copyStreamListener) throws CopyStreamException {
        return copyStream(inputStream, outputStream, i, j, copyStreamListener, true);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream, int i) throws CopyStreamException {
        return copyStream(inputStream, outputStream, i, -1L, null);
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream) throws CopyStreamException {
        return copyStream(inputStream, outputStream, 1024);
    }
}
