package com.amazon.alexa.ra.chrome.model;

import androidx.core.app.NotificationCompat;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.amazon.alexa.mobile.assistant.capabilities.localsearch.LocalSearchEngineCategories;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;
import com.amazon.alexa.routing.data.RouteName;
import com.amazon.alexa.voice.ui.onedesign.movies.MoviesContract;
import com.amazon.clouddrive.cdasdk.cds.common.MediaType;
import com.google.android.gms.stats.CodePackage;
import com.mapbox.common.MapboxServices;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bk\b\u0086\u0081\u0002\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001mB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010l\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bk¨\u0006n"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "", "nameInApi", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getNameInApi", "()Ljava/lang/String;", "ALARM", "ALARM_2", "AMAZED", "APPLAUSE", "BORED", "BORED_2", "CALENDAR", "CALENDAR_2", "CLOUDY", NotificationConstants.TYPE_COMMS, "DANCE", "DANCE_2", "DIRECTIONS", "DONE", "DONE_2", "DRY", "ECSTATIC", "ECSTATIC_2", "EXCITED", "FART", "FART_2", "FLIP_A_COIN", "FOGGY", "FUN_FACT", "FUN_FACT_2", "GAMES", "GENERATIVE", "GOODBYE", "GOODBYE_2", "GOOD_AFTERNOON", "GOOD_AFTERNOON_2", "GOOD_MORNING", "GOOD_MORNING_2", "GOOD_NIGHT", "GOOD_NIGHT_2", "GRATITUDE", "GRATITUDE_2", "GRATITUDE_3", "GRATITUDE_4", "HAPPY_BIRTHDAY", "HAPPY_BIRTHDAY_2", "HAVE_A_NICE_DAY", "HAVE_A_NICE_DAY_2", "HAVE_A_NICE_DAY_3", "HELLO", "HELLO_2", "HELLO_3", "HELLO_4", "HELLO_5", "HUMID", "INDEPENDENCE_DAY", "JOKE", "JOYFUL", "JOYFUL_2", "JOYFUL_3", "LIGHTS_OFF", "LIGHTS_ON", "LIST", "LIST_2", "LULLABY", "MONSOON", "MOVIES", LocalSearchEngineCategories.MUSIC, "MUSIC_2", "MUSIC_3", "MUSIC_4", "NEWS", "NEWS_2", "PEACEFUL", MediaType.PHOTOS, "PHOTOS_2", "PLAYFUL", "PODCAST", "PROUD", "RAINY", CodePackage.REMINDERS, "ROCK_PAPER_SCISSORS", "ROCK_PAPER_SCISSORS_2", "ROCK_PAPER_SCISSORS_3", "SING", "SNOWY", "STORYTIME", "STORYTIME_2", "SUNNY", "SUNNY_2", "TEASE_ME", "TEASE_ME_2", "THANK_YOU", "TICKETS", "TIMER", "TIMER_2", "VIDEO", "VIDEO_2", "WARM_EMPATHETIC", "WARM_EMPATHETIC_2", "WHAT_IS_YOUR_NAME", "WHERE_ARE_YOU", "WHERE_ARE_YOU_2", "WINDY", "WITTY", "getUri", "Companion", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PersonalityId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PersonalityId[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String PERSONALITY_NAME_UNKNOWN = "Unknown";

    @NotNull
    private static final String URI_PREFIX = "stagedir://personality/";

    @NotNull
    private final String nameInApi;
    public static final PersonalityId ALARM = new PersonalityId("ALARM", 0, NotificationCompat.CATEGORY_ALARM);
    public static final PersonalityId ALARM_2 = new PersonalityId("ALARM_2", 1, "alarm_2");
    public static final PersonalityId AMAZED = new PersonalityId("AMAZED", 2, "amazed");
    public static final PersonalityId APPLAUSE = new PersonalityId("APPLAUSE", 3, "applause");
    public static final PersonalityId BORED = new PersonalityId("BORED", 4, "bored");
    public static final PersonalityId BORED_2 = new PersonalityId("BORED_2", 5, "bored_2");
    public static final PersonalityId CALENDAR = new PersonalityId("CALENDAR", 6, "calendar");
    public static final PersonalityId CALENDAR_2 = new PersonalityId("CALENDAR_2", 7, "calendar_2");
    public static final PersonalityId CLOUDY = new PersonalityId("CLOUDY", 8, "cloudy");
    public static final PersonalityId COMMS = new PersonalityId(NotificationConstants.TYPE_COMMS, 9, "comms");
    public static final PersonalityId DANCE = new PersonalityId("DANCE", 10, "dance");
    public static final PersonalityId DANCE_2 = new PersonalityId("DANCE_2", 11, "dance_2");
    public static final PersonalityId DIRECTIONS = new PersonalityId("DIRECTIONS", 12, MapboxServices.DIRECTIONS);
    public static final PersonalityId DONE = new PersonalityId("DONE", 13, "done");
    public static final PersonalityId DONE_2 = new PersonalityId("DONE_2", 14, "done_2");
    public static final PersonalityId DRY = new PersonalityId("DRY", 15, "dry");
    public static final PersonalityId ECSTATIC = new PersonalityId("ECSTATIC", 16, "ecstatic");
    public static final PersonalityId ECSTATIC_2 = new PersonalityId("ECSTATIC_2", 17, "ecstatic_2");
    public static final PersonalityId EXCITED = new PersonalityId("EXCITED", 18, "excited");
    public static final PersonalityId FART = new PersonalityId("FART", 19, "fart");
    public static final PersonalityId FART_2 = new PersonalityId("FART_2", 20, "fart_2");
    public static final PersonalityId FLIP_A_COIN = new PersonalityId("FLIP_A_COIN", 21, "flip_a_coin");
    public static final PersonalityId FOGGY = new PersonalityId("FOGGY", 22, "foggy");
    public static final PersonalityId FUN_FACT = new PersonalityId("FUN_FACT", 23, "fun_fact");
    public static final PersonalityId FUN_FACT_2 = new PersonalityId("FUN_FACT_2", 24, "fun_fact_2");
    public static final PersonalityId GAMES = new PersonalityId("GAMES", 25, "games");
    public static final PersonalityId GENERATIVE = new PersonalityId("GENERATIVE", 26, "generative");
    public static final PersonalityId GOODBYE = new PersonalityId("GOODBYE", 27, "goodbye");
    public static final PersonalityId GOODBYE_2 = new PersonalityId("GOODBYE_2", 28, "goodbye_2");
    public static final PersonalityId GOOD_AFTERNOON = new PersonalityId("GOOD_AFTERNOON", 29, "good_afternoon");
    public static final PersonalityId GOOD_AFTERNOON_2 = new PersonalityId("GOOD_AFTERNOON_2", 30, "good_afternoon_2");
    public static final PersonalityId GOOD_MORNING = new PersonalityId("GOOD_MORNING", 31, "good_morning");
    public static final PersonalityId GOOD_MORNING_2 = new PersonalityId("GOOD_MORNING_2", 32, "good_morning_2");
    public static final PersonalityId GOOD_NIGHT = new PersonalityId("GOOD_NIGHT", 33, "good_night");
    public static final PersonalityId GOOD_NIGHT_2 = new PersonalityId("GOOD_NIGHT_2", 34, "good_night_2");
    public static final PersonalityId GRATITUDE = new PersonalityId("GRATITUDE", 35, "gratitude");
    public static final PersonalityId GRATITUDE_2 = new PersonalityId("GRATITUDE_2", 36, "gratitude_2");
    public static final PersonalityId GRATITUDE_3 = new PersonalityId("GRATITUDE_3", 37, "gratitude_3");
    public static final PersonalityId GRATITUDE_4 = new PersonalityId("GRATITUDE_4", 38, "gratitude_4");
    public static final PersonalityId HAPPY_BIRTHDAY = new PersonalityId("HAPPY_BIRTHDAY", 39, "happy_birthday");
    public static final PersonalityId HAPPY_BIRTHDAY_2 = new PersonalityId("HAPPY_BIRTHDAY_2", 40, "happy_birthday_2");
    public static final PersonalityId HAVE_A_NICE_DAY = new PersonalityId("HAVE_A_NICE_DAY", 41, "have_a_nice_day");
    public static final PersonalityId HAVE_A_NICE_DAY_2 = new PersonalityId("HAVE_A_NICE_DAY_2", 42, "have_a_nice_day_2");
    public static final PersonalityId HAVE_A_NICE_DAY_3 = new PersonalityId("HAVE_A_NICE_DAY_3", 43, "have_a_nice_day_3");
    public static final PersonalityId HELLO = new PersonalityId("HELLO", 44, "hello");
    public static final PersonalityId HELLO_2 = new PersonalityId("HELLO_2", 45, "hello_2");
    public static final PersonalityId HELLO_3 = new PersonalityId("HELLO_3", 46, "hello_3");
    public static final PersonalityId HELLO_4 = new PersonalityId("HELLO_4", 47, "hello_4");
    public static final PersonalityId HELLO_5 = new PersonalityId("HELLO_5", 48, "hello_5");
    public static final PersonalityId HUMID = new PersonalityId("HUMID", 49, "humid");
    public static final PersonalityId INDEPENDENCE_DAY = new PersonalityId("INDEPENDENCE_DAY", 50, "independence_day");
    public static final PersonalityId JOKE = new PersonalityId("JOKE", 51, "joke");
    public static final PersonalityId JOYFUL = new PersonalityId("JOYFUL", 52, "joyful");
    public static final PersonalityId JOYFUL_2 = new PersonalityId("JOYFUL_2", 53, "joyful_2");
    public static final PersonalityId JOYFUL_3 = new PersonalityId("JOYFUL_3", 54, "joyful_3");
    public static final PersonalityId LIGHTS_OFF = new PersonalityId("LIGHTS_OFF", 55, "lights_off");
    public static final PersonalityId LIGHTS_ON = new PersonalityId("LIGHTS_ON", 56, "lights_on");
    public static final PersonalityId LIST = new PersonalityId("LIST", 57, "list");
    public static final PersonalityId LIST_2 = new PersonalityId("LIST_2", 58, "list_2");
    public static final PersonalityId LULLABY = new PersonalityId("LULLABY", 59, "lullaby");
    public static final PersonalityId MONSOON = new PersonalityId("MONSOON", 60, "monsoon");
    public static final PersonalityId MOVIES = new PersonalityId("MOVIES", 61, MoviesContract.ROUTER);
    public static final PersonalityId MUSIC = new PersonalityId(LocalSearchEngineCategories.MUSIC, 62, "music");
    public static final PersonalityId MUSIC_2 = new PersonalityId("MUSIC_2", 63, "music_2");
    public static final PersonalityId MUSIC_3 = new PersonalityId("MUSIC_3", 64, "music_3");
    public static final PersonalityId MUSIC_4 = new PersonalityId("MUSIC_4", 65, "music_4");
    public static final PersonalityId NEWS = new PersonalityId("NEWS", 66, "news");
    public static final PersonalityId NEWS_2 = new PersonalityId("NEWS_2", 67, "news_2");
    public static final PersonalityId PEACEFUL = new PersonalityId("PEACEFUL", 68, "peaceful");
    public static final PersonalityId PHOTOS = new PersonalityId(MediaType.PHOTOS, 69, EventMetadataType.PHOTOS);
    public static final PersonalityId PHOTOS_2 = new PersonalityId("PHOTOS_2", 70, "photos_2");
    public static final PersonalityId PLAYFUL = new PersonalityId("PLAYFUL", 71, "playful");
    public static final PersonalityId PODCAST = new PersonalityId("PODCAST", 72, "podcast");
    public static final PersonalityId PROUD = new PersonalityId("PROUD", 73, "proud");
    public static final PersonalityId RAINY = new PersonalityId("RAINY", 74, "rainy");
    public static final PersonalityId REMINDERS = new PersonalityId(CodePackage.REMINDERS, 75, RouteName.REMINDERS);
    public static final PersonalityId ROCK_PAPER_SCISSORS = new PersonalityId("ROCK_PAPER_SCISSORS", 76, "rock_paper_scissors");
    public static final PersonalityId ROCK_PAPER_SCISSORS_2 = new PersonalityId("ROCK_PAPER_SCISSORS_2", 77, "rock_paper_scissors_2");
    public static final PersonalityId ROCK_PAPER_SCISSORS_3 = new PersonalityId("ROCK_PAPER_SCISSORS_3", 78, "rock_paper_scissors_3");
    public static final PersonalityId SING = new PersonalityId("SING", 79, "sing");
    public static final PersonalityId SNOWY = new PersonalityId("SNOWY", 80, "snowy");
    public static final PersonalityId STORYTIME = new PersonalityId("STORYTIME", 81, "storytime");
    public static final PersonalityId STORYTIME_2 = new PersonalityId("STORYTIME_2", 82, "storytime_2");
    public static final PersonalityId SUNNY = new PersonalityId("SUNNY", 83, "sunny");
    public static final PersonalityId SUNNY_2 = new PersonalityId("SUNNY_2", 84, "sunny_2");
    public static final PersonalityId TEASE_ME = new PersonalityId("TEASE_ME", 85, "tease_me");
    public static final PersonalityId TEASE_ME_2 = new PersonalityId("TEASE_ME_2", 86, "tease_me_2");
    public static final PersonalityId THANK_YOU = new PersonalityId("THANK_YOU", 87, "thank_you");
    public static final PersonalityId TICKETS = new PersonalityId("TICKETS", 88, "tickets");
    public static final PersonalityId TIMER = new PersonalityId("TIMER", 89, "timer");
    public static final PersonalityId TIMER_2 = new PersonalityId("TIMER_2", 90, "timer_2");
    public static final PersonalityId VIDEO = new PersonalityId("VIDEO", 91, "video");
    public static final PersonalityId VIDEO_2 = new PersonalityId("VIDEO_2", 92, "video_2");
    public static final PersonalityId WARM_EMPATHETIC = new PersonalityId("WARM_EMPATHETIC", 93, "warm_empathetic");
    public static final PersonalityId WARM_EMPATHETIC_2 = new PersonalityId("WARM_EMPATHETIC_2", 94, "warm_empathetic_2");
    public static final PersonalityId WHAT_IS_YOUR_NAME = new PersonalityId("WHAT_IS_YOUR_NAME", 95, "what_is_your_name");
    public static final PersonalityId WHERE_ARE_YOU = new PersonalityId("WHERE_ARE_YOU", 96, "where_are_you");
    public static final PersonalityId WHERE_ARE_YOU_2 = new PersonalityId("WHERE_ARE_YOU_2", 97, "where_are_you_2");
    public static final PersonalityId WINDY = new PersonalityId("WINDY", 98, "windy");
    public static final PersonalityId WITTY = new PersonalityId("WITTY", 99, "witty");

    private static final /* synthetic */ PersonalityId[] $values() {
        return new PersonalityId[]{ALARM, ALARM_2, AMAZED, APPLAUSE, BORED, BORED_2, CALENDAR, CALENDAR_2, CLOUDY, COMMS, DANCE, DANCE_2, DIRECTIONS, DONE, DONE_2, DRY, ECSTATIC, ECSTATIC_2, EXCITED, FART, FART_2, FLIP_A_COIN, FOGGY, FUN_FACT, FUN_FACT_2, GAMES, GENERATIVE, GOODBYE, GOODBYE_2, GOOD_AFTERNOON, GOOD_AFTERNOON_2, GOOD_MORNING, GOOD_MORNING_2, GOOD_NIGHT, GOOD_NIGHT_2, GRATITUDE, GRATITUDE_2, GRATITUDE_3, GRATITUDE_4, HAPPY_BIRTHDAY, HAPPY_BIRTHDAY_2, HAVE_A_NICE_DAY, HAVE_A_NICE_DAY_2, HAVE_A_NICE_DAY_3, HELLO, HELLO_2, HELLO_3, HELLO_4, HELLO_5, HUMID, INDEPENDENCE_DAY, JOKE, JOYFUL, JOYFUL_2, JOYFUL_3, LIGHTS_OFF, LIGHTS_ON, LIST, LIST_2, LULLABY, MONSOON, MOVIES, MUSIC, MUSIC_2, MUSIC_3, MUSIC_4, NEWS, NEWS_2, PEACEFUL, PHOTOS, PHOTOS_2, PLAYFUL, PODCAST, PROUD, RAINY, REMINDERS, ROCK_PAPER_SCISSORS, ROCK_PAPER_SCISSORS_2, ROCK_PAPER_SCISSORS_3, SING, SNOWY, STORYTIME, STORYTIME_2, SUNNY, SUNNY_2, TEASE_ME, TEASE_ME_2, THANK_YOU, TICKETS, TIMER, TIMER_2, VIDEO, VIDEO_2, WARM_EMPATHETIC, WARM_EMPATHETIC_2, WHAT_IS_YOUR_NAME, WHERE_ARE_YOU, WHERE_ARE_YOU_2, WINDY, WITTY};
    }

    static {
        PersonalityId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private PersonalityId(String str, int i, String str2) {
        this.nameInApi = str2;
    }

    @NotNull
    public static EnumEntries<PersonalityId> getEntries() {
        return $ENTRIES;
    }

    public static PersonalityId valueOf(String str) {
        return (PersonalityId) Enum.valueOf(PersonalityId.class, str);
    }

    public static PersonalityId[] values() {
        return (PersonalityId[]) $VALUES.clone();
    }

    @NotNull
    public final String getNameInApi() {
        return this.nameInApi;
    }

    @NotNull
    public final String getUri() {
        return a$$ExternalSyntheticOutline0.m(URI_PREFIX, this.nameInApi);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/PersonalityId$Companion;", "", "<init>", "()V", "URI_PREFIX", "", "PERSONALITY_NAME_UNKNOWN", "extractPersonalityName", "uri", "fromUri", "Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPersonalityId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalityId.kt\ncom/amazon/alexa/ra/chrome/model/PersonalityId$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String extractPersonalityName(@NotNull String uri) {
            boolean startsWith$default;
            String removePrefix;
            uri.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(uri, PersonalityId.URI_PREFIX, false, 2, null);
            if (!startsWith$default) {
                uri = null;
            }
            if (uri == null) {
                return null;
            }
            removePrefix = StringsKt__StringsKt.removePrefix(uri, (CharSequence) PersonalityId.URI_PREFIX);
            return removePrefix;
        }

        @Nullable
        public final PersonalityId fromUri(@NotNull String uri) {
            uri.getClass();
            String extractPersonalityName = extractPersonalityName(uri);
            if (extractPersonalityName != null) {
                for (PersonalityId personalityId : PersonalityId.values()) {
                    if (Intrinsics.areEqual(personalityId.getNameInApi(), extractPersonalityName)) {
                        return personalityId;
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
