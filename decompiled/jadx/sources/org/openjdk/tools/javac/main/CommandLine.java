package org.openjdk.tools.javac.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CommandLine {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Tokenizer {
        private int ch;
        private final Reader in;

        public Tokenizer(Reader reader) throws IOException {
            this.in = reader;
            this.ch = reader.read();
        }

        public String nextToken() throws IOException {
            skipWhite();
            if (this.ch == -1) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            char c = 0;
            while (true) {
                int i = this.ch;
                if (i == -1) {
                    return sb.toString();
                }
                if (i != 9) {
                    if (i != 10) {
                        if (i != 12) {
                            if (i == 13) {
                                break;
                            }
                            if (i != 32) {
                                if (i == 34 || i == 39) {
                                    if (c == 0) {
                                        c = (char) i;
                                    } else if (c == i) {
                                        c = 0;
                                    } else {
                                        sb.append((char) i);
                                    }
                                } else if (i != 92) {
                                    sb.append((char) i);
                                } else {
                                    if (c != 0) {
                                        int read = this.in.read();
                                        this.ch = read;
                                        if (read == 10 || read == 13) {
                                            while (true) {
                                                int i2 = this.ch;
                                                if (i2 == 32 || i2 == 10 || i2 == 13 || i2 == 9 || i2 == 12) {
                                                    this.ch = this.in.read();
                                                }
                                            }
                                        } else if (read == 102) {
                                            this.ch = 12;
                                        } else if (read == 110) {
                                            this.ch = 10;
                                        } else if (read == 114) {
                                            this.ch = 13;
                                        } else if (read == 116) {
                                            this.ch = 9;
                                        }
                                    }
                                    sb.append((char) this.ch);
                                }
                                this.ch = this.in.read();
                            }
                        }
                    } else {
                        break;
                    }
                }
                if (c == 0) {
                    return sb.toString();
                }
                sb.append((char) i);
                this.ch = this.in.read();
            }
            return sb.toString();
        }

        public void skipWhite() throws IOException {
            while (true) {
                int i = this.ch;
                if (i == -1) {
                    return;
                }
                if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
                    if (i != 35) {
                        return;
                    }
                    this.ch = this.in.read();
                    while (true) {
                        int i2 = this.ch;
                        if (i2 != 10 && i2 != 13 && i2 != -1) {
                            this.ch = this.in.read();
                        }
                    }
                }
                this.ch = this.in.read();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UnmatchedQuote extends Exception {
        private static final long serialVersionUID = 0;
        public final String variableName;

        public UnmatchedQuote(String str) {
            this.variableName = str;
        }
    }

    private static void appendParsedCommandArgs(List<String> list, List<String> list2) throws IOException {
        for (String str : list2) {
            if (str.length() <= 1 || str.charAt(0) != '@') {
                list.add(str);
            } else {
                String substring = str.substring(1);
                if (substring.charAt(0) == '@') {
                    list.add(substring);
                } else {
                    loadCmdFile(substring, list);
                }
            }
        }
    }

    private static void appendParsedEnvVariables(List<String> list, String str) throws UnmatchedQuote {
        String str2;
        if (str == null || (str2 = System.getenv(str)) == null || str2.trim().isEmpty()) {
            return;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char c = 0;
        loop0: while (i < length) {
            char charAt = str2.charAt(i);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                if (c == 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                    while (true) {
                        if (charAt == '\f' || charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == ' ') {
                            i++;
                            if (i >= length) {
                                break loop0;
                            } else {
                                charAt = str2.charAt(i);
                            }
                        }
                    }
                }
            } else if (charAt == '\"' || charAt == '\'') {
                if (c == 0) {
                    c = charAt;
                } else if (c == charAt) {
                    c = 0;
                } else {
                    sb.append(charAt);
                }
                i++;
            }
            sb.append(charAt);
            i++;
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }
        if (c != 0) {
            throw new UnmatchedQuote(str);
        }
    }

    private static void loadCmdFile(String str, List<String> list) throws IOException {
        BufferedReader newBufferedReader = Files.newBufferedReader(Paths.get(str, new String[0]));
        try {
            Tokenizer tokenizer = new Tokenizer(newBufferedReader);
            while (true) {
                String nextToken = tokenizer.nextToken();
                if (nextToken == null) {
                    break;
                } else {
                    list.add(nextToken);
                }
            }
            if (newBufferedReader != null) {
                newBufferedReader.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newBufferedReader != null) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static String[] parse(String[] strArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        appendParsedCommandArgs(arrayList, Arrays.asList(strArr));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static List<String> parse(String str, List<String> list) throws IOException, UnmatchedQuote {
        ArrayList arrayList = new ArrayList();
        appendParsedEnvVariables(arrayList, str);
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        appendParsedCommandArgs(arrayList2, arrayList);
        return arrayList2;
    }

    public static String[] parse(String str, String[] strArr) throws IOException, UnmatchedQuote {
        List<String> parse = parse(str, (List<String>) Arrays.asList(strArr));
        return (String[]) parse.toArray(new String[parse.size()]);
    }
}
