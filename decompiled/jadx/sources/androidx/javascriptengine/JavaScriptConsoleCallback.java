package androidx.javascriptengine;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface JavaScriptConsoleCallback {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ConsoleMessage {
        static final int LEVEL_ALL = 31;
        public static final int LEVEL_DEBUG = 2;
        public static final int LEVEL_ERROR = 8;
        public static final int LEVEL_INFO = 4;
        public static final int LEVEL_LOG = 1;
        public static final int LEVEL_WARNING = 16;
        private final int mColumn;
        private final int mLevel;
        private final int mLine;
        private final String mMessage;
        private final String mSource;
        private final String mTrace;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface Level {
        }

        public ConsoleMessage(int i, String str, String str2, int i2, int i3, String str3) {
            this.mLevel = i;
            this.mMessage = str;
            this.mSource = str2;
            this.mLine = i2;
            this.mColumn = i3;
            this.mTrace = str3;
        }

        private String getLevelInitial() {
            int i = this.mLevel;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? "?" : ExifInterface.LONGITUDE_WEST : ExifInterface.LONGITUDE_EAST : "I" : "D" : "L";
        }

        public int getColumn() {
            return this.mColumn;
        }

        public int getLevel() {
            return this.mLevel;
        }

        public int getLine() {
            return this.mLine;
        }

        public String getMessage() {
            return this.mMessage;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String getSource() {
            return this.mSource;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String getTrace() {
            return this.mTrace;
        }

        public String toString() {
            return getLevelInitial() + " <expression>:" + this.mLine + ":" + this.mColumn + ": " + this.mMessage;
        }
    }

    void onConsoleMessage(ConsoleMessage consoleMessage);

    default void onConsoleClear() {
    }
}
