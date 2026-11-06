package org.openjdk.tools.javac.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.openjdk.javax.tools.JavaFileManager;
import org.openjdk.tools.javac.file.JavacFileManager;
import org.openjdk.tools.javac.processing.AnnotationProcessingError;
import org.openjdk.tools.javac.util.Context;
import org.openjdk.tools.javac.util.Log;
import org.openjdk.tools.javac.util.Options;
import org.openjdk.tools.javac.util.PropagatedException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Main {
    private static final String ENV_OPT_NAME = "JDK_JAVAC_OPTIONS";
    public static final String javacBundleName = "org.openjdk.tools.javac.resources.javac";
    boolean apiMode;
    private JavaFileManager fileManager;
    public Log log;
    String ownName;
    PrintWriter stdErr;
    PrintWriter stdOut;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Result {
        OK(0),
        ERROR(1),
        CMDERR(2),
        SYSERR(3),
        ABNORMAL(4);

        public final int exitCode;

        Result(int i) {
            this.exitCode = i;
        }

        public boolean isOK() {
            return this.exitCode == 0;
        }
    }

    public Main(String str, PrintWriter printWriter) {
        this.ownName = str;
        this.stdErr = printWriter;
        this.stdOut = printWriter;
    }

    public void apMessage(AnnotationProcessingError annotationProcessingError) {
        this.log.printLines(Log.PrefixKind.JAVAC, "msg.proc.annotation.uncaught.exception", new Object[0]);
        annotationProcessingError.getCause().printStackTrace(this.log.getWriter(Log.WriterKind.NOTICE));
    }

    public void bugMessage(Throwable th) {
        this.log.printLines(Log.PrefixKind.JAVAC, "msg.bug", JavaCompiler.version());
        th.printStackTrace(this.log.getWriter(Log.WriterKind.NOTICE));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.openjdk.tools.javac.main.Main.Result compile(java.lang.String[] r7, org.openjdk.tools.javac.util.Context r8) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.openjdk.tools.javac.main.Main.compile(java.lang.String[], org.openjdk.tools.javac.util.Context):org.openjdk.tools.javac.main.Main$Result");
    }

    public void error(String str, Object... objArr) {
        if (this.apiMode) {
            throw new PropagatedException(new IllegalStateException(this.log.localize(Log.PrefixKind.JAVAC, str, objArr)));
        }
        warning(str, objArr);
        this.log.printLines(Log.PrefixKind.JAVAC, "msg.usage", this.ownName);
    }

    public void feMessage(Throwable th, Options options) {
        this.log.printRawLines(th.getMessage());
        if (th.getCause() == null || !options.isSet("dev")) {
            return;
        }
        th.getCause().printStackTrace(this.log.getWriter(Log.WriterKind.NOTICE));
    }

    public void ioMessage(Throwable th) {
        this.log.printLines(Log.PrefixKind.JAVAC, "msg.io", new Object[0]);
        th.printStackTrace(this.log.getWriter(Log.WriterKind.NOTICE));
    }

    public void pluginMessage(Throwable th) {
        this.log.printLines(Log.PrefixKind.JAVAC, "msg.plugin.uncaught.exception", new Object[0]);
        th.printStackTrace(this.log.getWriter(Log.WriterKind.NOTICE));
    }

    public void resourceMessage(Throwable th) {
        this.log.printLines(Log.PrefixKind.JAVAC, "msg.resource", new Object[0]);
        th.printStackTrace(this.log.getWriter(Log.WriterKind.NOTICE));
    }

    public void showClass(String str) {
        PrintWriter writer = this.log.getWriter(Log.WriterKind.NOTICE);
        writer.println("javac: show class: " + str);
        URL resource = getClass().getResource("/" + str.replace('.', '/') + ".class");
        if (resource != null) {
            writer.println("  " + resource);
        }
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream("/" + str.replace('.', '/') + ".class");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                DigestInputStream digestInputStream = new DigestInputStream(resourceAsStream, messageDigest);
                try {
                    while (digestInputStream.read(new byte[8192]) > 0) {
                    }
                    byte[] digest = messageDigest.digest();
                    digestInputStream.close();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", Byte.valueOf(b)));
                    }
                    writer.println("  MD5 checksum: " + ((Object) sb));
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            writer.println("  cannot compute digest: " + e);
        }
    }

    public void warning(String str, Object... objArr) {
        this.log.printRawLines(this.ownName + ": " + this.log.localize(Log.PrefixKind.JAVAC, str, objArr));
    }

    public Main(String str) {
        this.ownName = str;
    }

    public Main(String str, PrintWriter printWriter, PrintWriter printWriter2) {
        this.ownName = str;
        this.stdOut = printWriter;
        this.stdErr = printWriter2;
    }

    public Result compile(String[] strArr) {
        Context context = new Context();
        JavacFileManager.preRegister(context);
        Result compile = compile(strArr, context);
        JavaFileManager javaFileManager = this.fileManager;
        if (javaFileManager instanceof JavacFileManager) {
            try {
                ((JavacFileManager) javaFileManager).close();
                return compile;
            } catch (IOException e) {
                bugMessage(e);
            }
        }
        return compile;
    }
}
