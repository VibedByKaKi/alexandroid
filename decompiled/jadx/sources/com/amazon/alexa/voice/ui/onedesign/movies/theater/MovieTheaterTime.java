package com.amazon.alexa.voice.ui.onedesign.movies.theater;

import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MovieTheaterTime implements MovieTheaterTimeModel {
    private final CharSequence title;

    public MovieTheaterTime(CharSequence charSequence) {
        this.title = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MovieTheaterTime.class != obj.getClass()) {
            return false;
        }
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = ((MovieTheaterTime) obj).title;
        return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.theater.MovieTheaterTimeModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        return JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public String toString() {
        return "MovieTheaterTime{title=" + ((Object) this.title) + AbstractJsonLexerKt.END_OBJ;
    }
}
