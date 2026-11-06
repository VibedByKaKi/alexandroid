package com.amazon.alexa.voice.ui.onedesign.movies;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MoviesCard implements MoviesCardModel {
    public static final Parcelable.Creator<MoviesCard> CREATOR = new Parcelable.Creator<MoviesCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MoviesCard createFromParcel(Parcel parcel) {
            return new MoviesCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MoviesCard[] newArray(int i) {
            return new MoviesCard[i];
        }
    };
    private final CharSequence attribution;
    private final CharSequence linkText;
    private final String linkUrl;
    private final List<? extends MoviesCardModel.MovieModel> movieList;
    private final CharSequence subTitle;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence attribution;
        CharSequence linkText;
        String linkUrl;
        List<? extends MoviesCardModel.MovieModel> movieList = new ArrayList();
        CharSequence subTitle;
        CharSequence title;

        public Builder attribution(CharSequence charSequence) {
            this.attribution = charSequence;
            return this;
        }

        public MoviesCard build() {
            if (this.title == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("title == null");
                return null;
            }
            if (this.subTitle == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("subTitle == null");
                return null;
            }
            if (this.linkText == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("linkText == null");
                return null;
            }
            if (this.linkUrl == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("linkUrl == null");
                return null;
            }
            if (this.movieList != null) {
                return new MoviesCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("movieList == null");
            return null;
        }

        public Builder linkText(@NonNull CharSequence charSequence) {
            this.linkText = charSequence;
            return this;
        }

        public Builder linkUrl(@NonNull String str) {
            this.linkUrl = str;
            return this;
        }

        public Builder movieList(@NonNull List<? extends MoviesCardModel.MovieModel> list) {
            this.movieList = list;
            return this;
        }

        public Builder subTitle(@NonNull CharSequence charSequence) {
            this.subTitle = charSequence;
            return this;
        }

        public Builder title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public MoviesCard(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.title = (CharSequence) creator.createFromParcel(parcel);
        this.subTitle = (CharSequence) creator.createFromParcel(parcel);
        this.linkText = (CharSequence) creator.createFromParcel(parcel);
        this.linkUrl = parcel.readString();
        this.movieList = parcel.createTypedArrayList(Movie.CREATOR);
        this.attribution = (CharSequence) creator.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MoviesCard.class != obj.getClass()) {
            return false;
        }
        MoviesCard moviesCard = (MoviesCard) obj;
        if (!this.title.equals(moviesCard.title) || !this.subTitle.equals(moviesCard.subTitle) || !this.linkText.equals(moviesCard.linkText) || !this.linkUrl.equals(moviesCard.linkUrl) || !this.movieList.equals(moviesCard.movieList)) {
            return false;
        }
        CharSequence charSequence = this.attribution;
        CharSequence charSequence2 = moviesCard.attribution;
        return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel
    public CharSequence getAttribution() {
        return this.attribution;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel
    public CharSequence getLinkText() {
        return this.linkText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel
    public String getLinkUrl() {
        return this.linkUrl;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel
    public List<? extends MoviesCardModel.MovieModel> getMovieList() {
        return this.movieList;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel
    public CharSequence getSubTitle() {
        return this.subTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.movieList.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ChatData$$ExternalSyntheticOutline0.m(this.linkText, ChatData$$ExternalSyntheticOutline0.m(this.subTitle, ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31), 31), 31), 31, this.linkUrl)) * 31;
        CharSequence charSequence = this.attribution;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public String toString() {
        return "MoviesCard{title=" + ((Object) this.title) + ", subTitle=" + ((Object) this.subTitle) + ", linkText=" + ((Object) this.linkText) + ", linkUrl=" + this.linkUrl + ", movieList=" + this.movieList + ", attribution=" + ((Object) this.attribution) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        TextUtils.writeToParcel(this.subTitle, parcel, i);
        TextUtils.writeToParcel(this.linkText, parcel, i);
        parcel.writeString(this.linkUrl);
        parcel.writeTypedList(this.movieList);
        TextUtils.writeToParcel(this.attribution, parcel, i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Time implements MoviesCardModel.TimeModel {
        public static final Parcelable.Creator<Time> CREATOR = new Parcelable.Creator<Time>() { // from class: com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard.Time.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Time createFromParcel(Parcel parcel) {
                return new Time(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Time[] newArray(int i) {
                return new Time[i];
            }
        };
        private final CharSequence time;

        public Time(Parcel parcel) {
            this.time = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && Time.class == obj.getClass() && this.time.equals(((Time) obj).time);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.TimeModel
        public CharSequence getTime() {
            return this.time;
        }

        public int hashCode() {
            return this.time.hashCode() + JfifUtil.MARKER_EOI;
        }

        public String toString() {
            return "Time{time=" + ((Object) this.time) + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.time, parcel, i);
        }

        public Time(@NonNull CharSequence charSequence) {
            this.time = charSequence;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Rating implements MoviesCardModel.RatingModel {
        public static final Parcelable.Creator<Rating> CREATOR = new Parcelable.Creator<Rating>() { // from class: com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard.Rating.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Rating createFromParcel(Parcel parcel) {
                return new Rating(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Rating[] newArray(int i) {
                return new Rating[i];
            }
        };
        private final double average;
        private final double maximum;
        private final CharSequence source;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            double average;
            double maximum;
            CharSequence source;

            public Builder average(double d) {
                this.average = d;
                return this;
            }

            public Rating build() {
                return new Rating(this);
            }

            public Builder maximum(double d) {
                this.maximum = d;
                return this;
            }

            public Builder source(CharSequence charSequence) {
                this.source = charSequence;
                return this;
            }
        }

        public Rating(Parcel parcel) {
            this.average = parcel.readDouble();
            this.maximum = parcel.readDouble();
            this.source = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Rating.class != obj.getClass()) {
                return false;
            }
            Rating rating = (Rating) obj;
            if (Double.compare(this.average, rating.average) != 0 || Double.compare(this.maximum, rating.maximum) != 0) {
                return false;
            }
            CharSequence charSequence = this.source;
            CharSequence charSequence2 = rating.source;
            return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.RatingModel
        public double getAverage() {
            return this.average;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.RatingModel
        public double getMaximum() {
            return this.maximum;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.RatingModel
        public CharSequence getSource() {
            return this.source;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.average);
            int i = JfifUtil.MARKER_EOI + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            long doubleToLongBits2 = Double.doubleToLongBits(this.maximum);
            int i2 = ((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
            CharSequence charSequence = this.source;
            return i2 + (charSequence != null ? charSequence.hashCode() : 0);
        }

        public String toString() {
            return "Rating{average=" + this.average + ", maximum=" + this.maximum + ", source=" + ((Object) this.source) + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(this.average);
            parcel.writeDouble(this.maximum);
            TextUtils.writeToParcel(this.source, parcel, i);
        }

        public Rating(Builder builder) {
            this.average = builder.average;
            this.maximum = builder.maximum;
            this.source = builder.source;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Theater implements MoviesCardModel.TheaterModel {
        public static final Parcelable.Creator<Theater> CREATOR = new Parcelable.Creator<Theater>() { // from class: com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard.Theater.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Theater createFromParcel(Parcel parcel) {
                return new Theater(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Theater[] newArray(int i) {
                return new Theater[i];
            }
        };
        private final CharSequence location;
        private final CharSequence name;
        private final List<? extends MoviesCardModel.TimeModel> timeList;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            CharSequence location;
            CharSequence name;
            List<? extends MoviesCardModel.TimeModel> timeList = new ArrayList();

            public Theater build() {
                if (this.name == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("name == null");
                    return null;
                }
                if (this.location == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("location == null");
                    return null;
                }
                if (this.timeList != null) {
                    return new Theater(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("timeList == null");
                return null;
            }

            public Builder location(@NonNull CharSequence charSequence) {
                this.location = charSequence;
                return this;
            }

            public Builder name(@NonNull CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }

            public Builder timeList(@NonNull List<? extends MoviesCardModel.TimeModel> list) {
                this.timeList = list;
                return this;
            }
        }

        public Theater(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.name = (CharSequence) creator.createFromParcel(parcel);
            this.location = (CharSequence) creator.createFromParcel(parcel);
            this.timeList = parcel.createTypedArrayList(Time.CREATOR);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Theater.class != obj.getClass()) {
                return false;
            }
            Theater theater = (Theater) obj;
            return this.name.equals(theater.name) && this.location.equals(theater.location) && this.timeList.equals(theater.timeList);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.TheaterModel
        public CharSequence getLocation() {
            return this.location;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.TheaterModel
        public CharSequence getName() {
            return this.name;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.TheaterModel
        public List<? extends MoviesCardModel.TimeModel> getTimeList() {
            return this.timeList;
        }

        public int hashCode() {
            return this.timeList.hashCode() + ChatData$$ExternalSyntheticOutline0.m(this.location, ChatData$$ExternalSyntheticOutline0.m(this.name, JfifUtil.MARKER_EOI, 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Theater{name=");
            sb.append((Object) this.name);
            sb.append(", location=");
            sb.append((Object) this.location);
            sb.append(", timeList=");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.timeList, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.name, parcel, i);
            TextUtils.writeToParcel(this.location, parcel, i);
            parcel.writeTypedList(this.timeList);
        }

        public Theater(Builder builder) {
            this.name = builder.name;
            this.location = builder.location;
            this.timeList = builder.timeList;
        }
    }

    public MoviesCard(Builder builder) {
        this.title = builder.title;
        this.subTitle = builder.subTitle;
        this.linkText = builder.linkText;
        this.linkUrl = builder.linkUrl;
        this.movieList = builder.movieList;
        this.attribution = builder.attribution;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Movie implements MoviesCardModel.MovieModel {
        public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() { // from class: com.amazon.alexa.voice.ui.onedesign.movies.MoviesCard.Movie.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Movie createFromParcel(Parcel parcel) {
                return new Movie(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Movie[] newArray(int i) {
                return new Movie[i];
            }
        };
        private final CharSequence about;
        private final List<CharSequence> cast;
        private final int duration;
        private final String imageUrl;
        private final MoviesCardModel.RatingModel imdbRating;
        private final CharSequence linkText;
        private final String linkUrl;
        private final CharSequence name;
        private final CharSequence rating;
        private final int releaseYear;
        private final List<? extends MoviesCardModel.TheaterModel> theaterList;
        private final String videoUrl;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            CharSequence about;
            List<CharSequence> cast;
            int duration;
            String imageUrl;
            MoviesCardModel.RatingModel imdbRating;
            CharSequence linkText;
            String linkUrl;
            CharSequence name;
            CharSequence rating;
            int releaseYear;
            List<? extends MoviesCardModel.TheaterModel> theaterList = new ArrayList();
            String videoUrl;

            public Builder about(CharSequence charSequence) {
                this.about = charSequence;
                return this;
            }

            public Movie build() {
                if (this.name == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("name == null");
                    return null;
                }
                if (this.linkText == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("linkText == null");
                    return null;
                }
                if (this.linkUrl == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("linkUrl == null");
                    return null;
                }
                if (this.theaterList != null) {
                    return new Movie(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("theaterList == null");
                return null;
            }

            public Builder cast(List<CharSequence> list) {
                this.cast = list;
                return this;
            }

            public Builder duration(int i) {
                this.duration = i;
                return this;
            }

            public Builder imageUrl(String str) {
                this.imageUrl = str;
                return this;
            }

            public Builder imdbRating(MoviesCardModel.RatingModel ratingModel) {
                this.imdbRating = ratingModel;
                return this;
            }

            public Builder linkText(@NonNull CharSequence charSequence) {
                this.linkText = charSequence;
                return this;
            }

            public Builder linkUrl(@NonNull String str) {
                this.linkUrl = str;
                return this;
            }

            public Builder name(@NonNull CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }

            public Builder rating(CharSequence charSequence) {
                this.rating = charSequence;
                return this;
            }

            public Builder releaseYear(int i) {
                this.releaseYear = i;
                return this;
            }

            public Builder theaterList(@NonNull List<? extends MoviesCardModel.TheaterModel> list) {
                this.theaterList = list;
                return this;
            }

            public Builder videoUrl(String str) {
                this.videoUrl = str;
                return this;
            }
        }

        public Movie(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.name = (CharSequence) creator.createFromParcel(parcel);
            this.duration = parcel.readInt();
            this.releaseYear = parcel.readInt();
            this.rating = (CharSequence) creator.createFromParcel(parcel);
            this.imdbRating = (MoviesCardModel.RatingModel) parcel.readParcelable(MoviesCardModel.RatingModel.class.getClassLoader());
            this.about = (CharSequence) creator.createFromParcel(parcel);
            int readInt = parcel.readInt();
            this.cast = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                this.cast.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
            this.linkText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.linkUrl = parcel.readString();
            this.videoUrl = parcel.readString();
            this.imageUrl = parcel.readString();
            this.theaterList = parcel.createTypedArrayList(Theater.CREATOR);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Movie.class != obj.getClass()) {
                return false;
            }
            Movie movie = (Movie) obj;
            if (!this.name.equals(movie.name) || this.duration != movie.duration || this.releaseYear != movie.releaseYear) {
                return false;
            }
            CharSequence charSequence = this.rating;
            CharSequence charSequence2 = movie.rating;
            if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
                return false;
            }
            MoviesCardModel.RatingModel ratingModel = this.imdbRating;
            MoviesCardModel.RatingModel ratingModel2 = movie.imdbRating;
            if (ratingModel == null ? ratingModel2 != null : !ratingModel.equals(ratingModel2)) {
                return false;
            }
            CharSequence charSequence3 = this.about;
            CharSequence charSequence4 = movie.about;
            if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
                return false;
            }
            List<CharSequence> list = this.cast;
            List<CharSequence> list2 = movie.cast;
            if (list == null ? list2 != null : !list.equals(list2)) {
                return false;
            }
            if (!this.linkText.equals(movie.linkText) || !this.linkUrl.equals(movie.linkUrl)) {
                return false;
            }
            String str = this.videoUrl;
            String str2 = movie.videoUrl;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.imageUrl;
            String str4 = movie.imageUrl;
            if (str3 == null ? str4 == null : str3.equals(str4)) {
                return this.theaterList.equals(movie.theaterList);
            }
            return false;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public CharSequence getAbout() {
            return this.about;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public List<CharSequence> getCast() {
            return this.cast;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public int getDuration() {
            return this.duration;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public String getImageUrl() {
            return this.imageUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public MoviesCardModel.RatingModel getImdbRating() {
            return this.imdbRating;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public CharSequence getLinkText() {
            return this.linkText;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public String getLinkUrl() {
            return this.linkUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public CharSequence getName() {
            return this.name;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public CharSequence getRating() {
            return this.rating;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public int getReleaseYear() {
            return this.releaseYear;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public List<? extends MoviesCardModel.TheaterModel> getTheaterList() {
            return this.theaterList;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.movies.MoviesCardModel.MovieModel
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            int m = (((ChatData$$ExternalSyntheticOutline0.m(this.name, JfifUtil.MARKER_EOI, 31) + this.duration) * 31) + this.releaseYear) * 31;
            CharSequence charSequence = this.rating;
            int hashCode = (m + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
            MoviesCardModel.RatingModel ratingModel = this.imdbRating;
            int hashCode2 = (hashCode + (ratingModel != null ? ratingModel.hashCode() : 0)) * 31;
            CharSequence charSequence2 = this.about;
            int hashCode3 = (hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
            List<CharSequence> list = this.cast;
            int m2 = ArcMode$$ExternalSyntheticOutline0.m(ChatData$$ExternalSyntheticOutline0.m(this.linkText, (hashCode3 + (list != null ? list.hashCode() : 0)) * 31, 31), 31, this.linkUrl);
            String str = this.videoUrl;
            int hashCode4 = (m2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.imageUrl;
            return this.theaterList.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Movie{name=");
            sb.append((Object) this.name);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", releaseYear=");
            sb.append(this.releaseYear);
            sb.append(", rating=");
            sb.append((Object) this.rating);
            sb.append(", imdbRating=");
            sb.append(this.imdbRating);
            sb.append(", about=");
            sb.append((Object) this.about);
            sb.append(", cast=");
            sb.append(this.cast);
            sb.append(", linkText=");
            sb.append((Object) this.linkText);
            sb.append(", linkUrl=");
            sb.append(this.linkUrl);
            sb.append(", videoUrl=");
            sb.append(this.videoUrl);
            sb.append(", imageUrl=");
            sb.append(this.imageUrl);
            sb.append(", theaterList=");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.theaterList, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.name, parcel, i);
            parcel.writeInt(this.duration);
            parcel.writeInt(this.releaseYear);
            TextUtils.writeToParcel(this.rating, parcel, i);
            parcel.writeParcelable(this.imdbRating, i);
            TextUtils.writeToParcel(this.about, parcel, i);
            List<CharSequence> list = this.cast;
            if (list != null) {
                parcel.writeInt(list.size());
                Iterator<CharSequence> it2 = this.cast.iterator();
                while (it2.hasNext()) {
                    TextUtils.writeToParcel(it2.next(), parcel, i);
                }
            } else {
                parcel.writeInt(0);
            }
            TextUtils.writeToParcel(this.linkText, parcel, i);
            parcel.writeString(this.linkUrl);
            parcel.writeString(this.videoUrl);
            parcel.writeString(this.imageUrl);
            parcel.writeTypedList(this.theaterList);
        }

        public Movie(Builder builder) {
            this.name = builder.name;
            this.duration = builder.duration;
            this.releaseYear = builder.releaseYear;
            this.rating = builder.rating;
            this.imdbRating = builder.imdbRating;
            this.about = builder.about;
            this.cast = builder.cast;
            this.linkText = builder.linkText;
            this.linkUrl = builder.linkUrl;
            this.videoUrl = builder.videoUrl;
            this.imageUrl = builder.imageUrl;
            this.theaterList = builder.theaterList;
        }
    }
}
