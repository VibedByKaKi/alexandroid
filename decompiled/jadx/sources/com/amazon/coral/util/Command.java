package com.amazon.coral.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class Command {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CommandOutput {
        private final String standardErr;
        private final String standardOut;
        private final int statusCode;

        public CommandOutput(String str, String str2, int i) {
            this.standardOut = str;
            this.standardErr = str2;
            this.statusCode = i;
        }

        public String getStandardErr() {
            return this.standardErr;
        }

        public String getStandardOut() {
            return this.standardOut;
        }

        public int getStatusCode() {
            return this.statusCode;
        }
    }

    private Command() {
    }

    public static CommandOutput run(String... strArr) {
        try {
            Process exec = Runtime.getRuntime().exec(strArr, (String[]) null);
            InputStream inputStream = exec.getInputStream();
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(exec.getErrorStream(), charset);
                try {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[1024];
                    char[] cArr2 = new char[1024];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        int read2 = inputStreamReader2.read(cArr2);
                        if (read == -1 && read2 == -1) {
                            exec.waitFor();
                            CommandOutput commandOutput = new CommandOutput(sb.toString(), sb2.toString(), exec.exitValue());
                            inputStreamReader2.close();
                            inputStreamReader.close();
                            return commandOutput;
                        }
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        }
                        if (read2 != -1) {
                            sb2.append(cArr2, 0, read2);
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | InterruptedException e) {
            throw Throwables.sneakyThrow(e);
        }
    }
}
