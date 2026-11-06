package com.facebook.soloader.recovery;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import java.io.File;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes7.dex */
public class BaseApkPathHistory {

    @GuardedBy("this")
    private int mCounter;

    @GuardedBy("this")
    private final String[] mPaths;

    public BaseApkPathHistory(int i) {
        if (i <= 0) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.mPaths = new String[i];
        this.mCounter = 0;
    }

    public synchronized boolean recordPathIfNew(String str) {
        for (String str2 : this.mPaths) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        report(sb);
        LogUtil.w(SoLoader.TAG, sb.toString());
        String[] strArr = this.mPaths;
        int i = this.mCounter;
        strArr[i % strArr.length] = str;
        this.mCounter = i + 1;
        return true;
    }

    public synchronized void report(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.mCounter);
            sb.append(" base apk paths.");
            if (this.mCounter > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = this.mPaths;
                if (i < strArr.length) {
                    int i2 = (this.mCounter - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.mCounter;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        report(sb);
        return sb.toString();
    }
}
