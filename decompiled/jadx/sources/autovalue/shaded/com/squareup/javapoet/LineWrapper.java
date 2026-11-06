package autovalue.shaded.com.squareup.javapoet;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class LineWrapper {
    private boolean closed;
    private final int columnLimit;
    private final String indent;
    private FlushType nextFlush;
    private final RecordingAppendable out;
    private final StringBuilder buffer = new StringBuilder();
    private int column = 0;
    private int indentLevel = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.squareup.javapoet.LineWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType;

        static {
            int[] iArr = new int[FlushType.values().length];
            $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType = iArr;
            try {
                iArr[FlushType.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType[FlushType.SPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType[FlushType.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FlushType {
        WRAP,
        SPACE,
        EMPTY
    }

    public LineWrapper(Appendable appendable, String str, int i) {
        Util.checkNotNull(appendable, "out == null", new Object[0]);
        this.out = new RecordingAppendable(appendable);
        this.indent = str;
        this.columnLimit = i;
    }

    private void flush(FlushType flushType) throws IOException {
        int i;
        int i2 = AnonymousClass1.$SwitchMap$com$squareup$javapoet$LineWrapper$FlushType[flushType.ordinal()];
        if (i2 == 1) {
            this.out.append('\n');
            int i3 = 0;
            while (true) {
                i = this.indentLevel;
                if (i3 >= i) {
                    break;
                }
                this.out.append(this.indent);
                i3++;
            }
            int length = this.indent.length() * i;
            this.column = length;
            this.column = this.buffer.length() + length;
        } else if (i2 == 2) {
            this.out.append(' ');
        } else if (i2 != 3) {
            Gson$$ExternalSyntheticBUOutline0.m((Object) flushType, "Unknown FlushType: ");
            return;
        }
        this.out.append(this.buffer);
        StringBuilder sb = this.buffer;
        sb.delete(0, sb.length());
        this.indentLevel = -1;
        this.nextFlush = null;
    }

    public void append(String str) throws IOException {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("closed");
            return;
        }
        if (this.nextFlush != null) {
            int indexOf = str.indexOf(10);
            if (indexOf == -1) {
                if (str.length() + this.column <= this.columnLimit) {
                    this.buffer.append(str);
                    this.column = str.length() + this.column;
                    return;
                }
            }
            flush((indexOf == -1 || this.column + indexOf > this.columnLimit) ? FlushType.WRAP : this.nextFlush);
        }
        this.out.append(str);
        this.column = str.lastIndexOf(10) != -1 ? (str.length() - r0) - 1 : str.length() + this.column;
    }

    public void close() throws IOException {
        FlushType flushType = this.nextFlush;
        if (flushType != null) {
            flush(flushType);
        }
        this.closed = true;
    }

    public char lastChar() {
        return this.out.lastChar;
    }

    public void wrappingSpace(int i) throws IOException {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("closed");
            return;
        }
        FlushType flushType = this.nextFlush;
        if (flushType != null) {
            flush(flushType);
        }
        this.column++;
        this.nextFlush = FlushType.SPACE;
        this.indentLevel = i;
    }

    public void zeroWidthSpace(int i) throws IOException {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("closed");
            return;
        }
        if (this.column == 0) {
            return;
        }
        FlushType flushType = this.nextFlush;
        if (flushType != null) {
            flush(flushType);
        }
        this.nextFlush = FlushType.EMPTY;
        this.indentLevel = i;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RecordingAppendable implements Appendable {
        private final Appendable delegate;
        char lastChar = 0;

        public RecordingAppendable(Appendable appendable) {
            this.delegate = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            if (length != 0) {
                this.lastChar = charSequence.charAt(length - 1);
            }
            return this.delegate.append(charSequence);
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            return append(charSequence.subSequence(i, i2));
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            this.lastChar = c;
            return this.delegate.append(c);
        }
    }
}
