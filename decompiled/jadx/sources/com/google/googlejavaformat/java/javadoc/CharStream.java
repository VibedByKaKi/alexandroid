package com.google.googlejavaformat.java.javadoc;

import com.google.common.base.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class CharStream {
    String remaining;
    int toConsume;

    public CharStream(String str) {
        this.remaining = (String) Preconditions.checkNotNull(str);
    }

    public boolean isExhausted() {
        return this.remaining.isEmpty();
    }

    public String readAndResetRecorded() {
        String substring = this.remaining.substring(0, this.toConsume);
        this.remaining = this.remaining.substring(this.toConsume);
        this.toConsume = 0;
        return substring;
    }

    public boolean tryConsume(String str) {
        if (!this.remaining.startsWith(str)) {
            return false;
        }
        this.toConsume = str.length();
        return true;
    }

    public boolean tryConsumeRegex(Pattern pattern) {
        Matcher matcher = pattern.matcher(this.remaining);
        if (!matcher.find()) {
            return false;
        }
        Preconditions.checkArgument(matcher.start() == 0);
        this.toConsume = matcher.end();
        return true;
    }
}
