package org.apache.commons.io.output;

import com.amazon.alexa.presence.service.PresenceJobService;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOIndexedException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class FilterCollectionWriter extends Writer {
    protected final Collection<Writer> EMPTY_WRITERS;
    protected final Collection<Writer> writers;

    public FilterCollectionWriter(Writer... writerArr) {
        List list = Collections.EMPTY_LIST;
        this.EMPTY_WRITERS = list;
        this.writers = writerArr != null ? Arrays.asList(writerArr) : list;
    }

    private List<Exception> add(List<Exception> list, int i, IOException iOException) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new IOIndexedException(i, iOException));
        return list;
    }

    private boolean notEmpty(List<Exception> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        List<Exception> list = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(c);
                } catch (IOException e) {
                    list = add(list, i, e);
                }
            }
            i++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("append", list);
        }
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        List<Exception> list = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    list = add(list, i, e);
                }
            }
            i++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("close", list);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        List<Exception> list = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.flush();
                } catch (IOException e) {
                    list = add(list, i, e);
                }
            }
            i++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList(PresenceJobService.ACTION_REFRESH_FLUSH_KEY, list);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        List<Exception> list = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr);
                } catch (IOException e) {
                    list = add(list, i, e);
                }
            }
            i++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    public FilterCollectionWriter(Collection<Writer> collection) {
        List list = Collections.EMPTY_LIST;
        this.EMPTY_WRITERS = list;
        this.writers = collection == null ? list : collection;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        List<Exception> list = null;
        int i3 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr, i, i2);
                } catch (IOException e) {
                    list = add(list, i3, e);
                }
            }
            i3++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        List<Exception> list = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence);
                } catch (IOException e) {
                    list = add(list, i, e);
                }
            }
            i++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("append", list);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        List<Exception> list = null;
        int i2 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(i);
                } catch (IOException e) {
                    list = add(list, i2, e);
                }
            }
            i2++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        List<Exception> list = null;
        int i3 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence, i, i2);
                } catch (IOException e) {
                    list = add(list, i3, e);
                }
            }
            i3++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("append", list);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        List<Exception> list = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str);
                } catch (IOException e) {
                    list = add(list, i, e);
                }
            }
            i++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        List<Exception> list = null;
        int i3 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str, i, i2);
                } catch (IOException e) {
                    list = add(list, i3, e);
                }
            }
            i3++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }
}
