package com.amazon.alexa.ra.chrome.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessory.notificationpublisher.parser.BaseCustomAppParser;
import com.amazon.alexa.ra.chrome.ui.TransitionalBambooChromeType;
import io.branch.referral.validators.LinkingValidatorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000¢\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001³\u0001ijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001¨\u0006Î\u0001"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType;", "<init>", "()V", "Alarm", "Alarm2", "Amazed", "Applause", "Bored", "Bored2", BaseCustomAppParser.CALENDAR_APP_CATEGORY, "Calendar2", "Cloudy", "Comms", "Dance", "Dance2", "Directions", LinkingValidatorConstants.step3ButtonText, "Done2", "Dry", "Ecstatic", "Ecstatic2", "Excited", "Fart", "Fart2", "FlipACoin", "Foggy", "FunFact", "FunFact2", "Games", "Generative", "GoodBye", "Goodbye2", "GoodAfternoon", "GoodAfternoon2", "GoodMorning", "GoodMorning2", "GoodNight", "GoodNight2", "Gratitude", "Gratitude2", "Gratitude3", "Gratitude4", "HappyBirthday", "HappyBirthday2", "HaveANiceDay", "HaveANiceDay2", "HaveANiceDay3", "Hello", "Hello2", "Hello3", "Hello4", "Hello5", "Humid", "IndependenceDay", "Joke", "Joyful", "Joyful2", "Joyful3", "LightsOff", "LightsOn", "List", "List2", "Lullaby", "Monsoon", "Movies", "Music", "Music2", "Music3", "Music4", "News", "News2", "Peaceful", "Photos", "Photos2", "Playful", "Podcast", "Proud", "Rainy", "Reminders", "RockPaperScissors", "RockPaperScissors2", "RockPaperScissors3", "Sing", "Snowy", "StoryTime", "Storytime2", "Sunny", "Sunny2", "TeaseMe", "TeaseMe2", "ThankYou", "Tickets", "Timer", "Timer2", "Video", "Video2", "WarmEmpathetic", "WarmEmpathetic2", "WhatIsYourName", "WhereAreYou", "WhereAreYou2", "Windy", "Witty", "Generic", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Alarm;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Alarm2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Amazed;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Applause;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Bored;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Bored2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Calendar;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Calendar2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Cloudy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Comms;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Dance;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Dance2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Directions;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Done;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Done2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Dry;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Ecstatic;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Ecstatic2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Excited;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Fart;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Fart2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$FlipACoin;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Foggy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$FunFact;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$FunFact2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Games;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Generative;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Generic;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodAfternoon;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodAfternoon2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodBye;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodMorning;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodMorning2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodNight;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodNight2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Goodbye2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude4;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HappyBirthday;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HappyBirthday2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HaveANiceDay;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HaveANiceDay2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HaveANiceDay3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello4;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello5;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Humid;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$IndependenceDay;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joke;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joyful;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joyful2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joyful3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$LightsOff;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$LightsOn;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$List;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$List2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Lullaby;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Monsoon;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Movies;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music4;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$News;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$News2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Peaceful;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Photos;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Photos2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Playful;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Podcast;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Proud;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Rainy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Reminders;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$RockPaperScissors;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$RockPaperScissors2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$RockPaperScissors3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Sing;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Snowy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$StoryTime;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Storytime2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Sunny;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Sunny2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$TeaseMe;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$TeaseMe2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$ThankYou;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Tickets;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Timer;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Timer2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Video;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Video2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WarmEmpathetic;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WarmEmpathetic2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WhatIsYourName;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WhereAreYou;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WhereAreYou2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Windy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Witty;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class PersonalityBambooChromeType extends TransitionalBambooChromeType {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Alarm;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alarm extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Alarm INSTANCE = new Alarm();

        private Alarm() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Alarm2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alarm2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Alarm2 INSTANCE = new Alarm2();

        private Alarm2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Amazed;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Amazed extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Amazed INSTANCE = new Amazed();

        private Amazed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Applause;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Applause extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Applause INSTANCE = new Applause();

        private Applause() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Bored;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bored extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Bored INSTANCE = new Bored();

        private Bored() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Bored2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bored2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Bored2 INSTANCE = new Bored2();

        private Bored2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Calendar;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Calendar extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Calendar INSTANCE = new Calendar();

        private Calendar() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Calendar2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Calendar2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Calendar2 INSTANCE = new Calendar2();

        private Calendar2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Cloudy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cloudy extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Cloudy INSTANCE = new Cloudy();

        private Cloudy() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Comms;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Comms extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Comms INSTANCE = new Comms();

        private Comms() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Dance;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dance extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Dance INSTANCE = new Dance();

        private Dance() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Dance2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dance2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Dance2 INSTANCE = new Dance2();

        private Dance2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Directions;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Directions extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Directions INSTANCE = new Directions();

        private Directions() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Done;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Done extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Done INSTANCE = new Done();

        private Done() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Done2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Done2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Done2 INSTANCE = new Done2();

        private Done2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Dry;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dry extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Dry INSTANCE = new Dry();

        private Dry() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Ecstatic;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ecstatic extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Ecstatic INSTANCE = new Ecstatic();

        private Ecstatic() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Ecstatic2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ecstatic2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Ecstatic2 INSTANCE = new Ecstatic2();

        private Ecstatic2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Excited;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Excited extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Excited INSTANCE = new Excited();

        private Excited() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Fart;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fart extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Fart INSTANCE = new Fart();

        private Fart() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Fart2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fart2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Fart2 INSTANCE = new Fart2();

        private Fart2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$FlipACoin;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlipACoin extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final FlipACoin INSTANCE = new FlipACoin();

        private FlipACoin() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Foggy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Foggy extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Foggy INSTANCE = new Foggy();

        private Foggy() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$FunFact;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FunFact extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final FunFact INSTANCE = new FunFact();

        private FunFact() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$FunFact2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FunFact2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final FunFact2 INSTANCE = new FunFact2();

        private FunFact2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Games;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Games extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Games INSTANCE = new Games();

        private Games() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Generative;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Generative extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Generative INSTANCE = new Generative();

        private Generative() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Generic;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Generic extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Generic INSTANCE = new Generic();

        private Generic() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodAfternoon;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodAfternoon extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodAfternoon INSTANCE = new GoodAfternoon();

        private GoodAfternoon() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodAfternoon2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodAfternoon2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodAfternoon2 INSTANCE = new GoodAfternoon2();

        private GoodAfternoon2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodBye;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodBye extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodBye INSTANCE = new GoodBye();

        private GoodBye() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodMorning;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodMorning extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodMorning INSTANCE = new GoodMorning();

        private GoodMorning() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodMorning2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodMorning2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodMorning2 INSTANCE = new GoodMorning2();

        private GoodMorning2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodNight;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodNight extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodNight INSTANCE = new GoodNight();

        private GoodNight() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$GoodNight2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoodNight2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final GoodNight2 INSTANCE = new GoodNight2();

        private GoodNight2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Goodbye2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Goodbye2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Goodbye2 INSTANCE = new Goodbye2();

        private Goodbye2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gratitude extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Gratitude INSTANCE = new Gratitude();

        private Gratitude() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gratitude2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Gratitude2 INSTANCE = new Gratitude2();

        private Gratitude2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gratitude3 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Gratitude3 INSTANCE = new Gratitude3();

        private Gratitude3() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Gratitude4;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gratitude4 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Gratitude4 INSTANCE = new Gratitude4();

        private Gratitude4() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HappyBirthday;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HappyBirthday extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final HappyBirthday INSTANCE = new HappyBirthday();

        private HappyBirthday() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HappyBirthday2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HappyBirthday2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final HappyBirthday2 INSTANCE = new HappyBirthday2();

        private HappyBirthday2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HaveANiceDay;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HaveANiceDay extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final HaveANiceDay INSTANCE = new HaveANiceDay();

        private HaveANiceDay() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HaveANiceDay2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HaveANiceDay2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final HaveANiceDay2 INSTANCE = new HaveANiceDay2();

        private HaveANiceDay2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$HaveANiceDay3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HaveANiceDay3 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final HaveANiceDay3 INSTANCE = new HaveANiceDay3();

        private HaveANiceDay3() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hello extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Hello INSTANCE = new Hello();

        private Hello() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hello2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Hello2 INSTANCE = new Hello2();

        private Hello2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hello3 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Hello3 INSTANCE = new Hello3();

        private Hello3() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello4;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hello4 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Hello4 INSTANCE = new Hello4();

        private Hello4() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Hello5;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hello5 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Hello5 INSTANCE = new Hello5();

        private Hello5() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Humid;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Humid extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Humid INSTANCE = new Humid();

        private Humid() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$IndependenceDay;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndependenceDay extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final IndependenceDay INSTANCE = new IndependenceDay();

        private IndependenceDay() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joke;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Joke extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Joke INSTANCE = new Joke();

        private Joke() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joyful;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Joyful extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Joyful INSTANCE = new Joyful();

        private Joyful() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joyful2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Joyful2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Joyful2 INSTANCE = new Joyful2();

        private Joyful2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Joyful3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Joyful3 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Joyful3 INSTANCE = new Joyful3();

        private Joyful3() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$LightsOff;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LightsOff extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final LightsOff INSTANCE = new LightsOff();

        private LightsOff() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$LightsOn;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LightsOn extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final LightsOn INSTANCE = new LightsOn();

        private LightsOn() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$List;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class List extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final List INSTANCE = new List();

        private List() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$List2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class List2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final List2 INSTANCE = new List2();

        private List2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Lullaby;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Lullaby extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Lullaby INSTANCE = new Lullaby();

        private Lullaby() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Monsoon;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Monsoon extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Monsoon INSTANCE = new Monsoon();

        private Monsoon() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Movies;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Movies extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Movies INSTANCE = new Movies();

        private Movies() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Music extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Music INSTANCE = new Music();

        private Music() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Music2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Music2 INSTANCE = new Music2();

        private Music2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Music3 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Music3 INSTANCE = new Music3();

        private Music3() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Music4;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Music4 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Music4 INSTANCE = new Music4();

        private Music4() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$News;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class News extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final News INSTANCE = new News();

        private News() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$News2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class News2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final News2 INSTANCE = new News2();

        private News2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Peaceful;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Peaceful extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Peaceful INSTANCE = new Peaceful();

        private Peaceful() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Photos;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Photos extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Photos INSTANCE = new Photos();

        private Photos() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Photos2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Photos2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Photos2 INSTANCE = new Photos2();

        private Photos2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Playful;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Playful extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Playful INSTANCE = new Playful();

        private Playful() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Podcast;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Podcast extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Podcast INSTANCE = new Podcast();

        private Podcast() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Proud;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Proud extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Proud INSTANCE = new Proud();

        private Proud() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Rainy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rainy extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Rainy INSTANCE = new Rainy();

        private Rainy() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Reminders;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Reminders extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Reminders INSTANCE = new Reminders();

        private Reminders() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$RockPaperScissors;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RockPaperScissors extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final RockPaperScissors INSTANCE = new RockPaperScissors();

        private RockPaperScissors() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$RockPaperScissors2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RockPaperScissors2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final RockPaperScissors2 INSTANCE = new RockPaperScissors2();

        private RockPaperScissors2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$RockPaperScissors3;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RockPaperScissors3 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final RockPaperScissors3 INSTANCE = new RockPaperScissors3();

        private RockPaperScissors3() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Sing;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sing extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Sing INSTANCE = new Sing();

        private Sing() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Snowy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Snowy extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Snowy INSTANCE = new Snowy();

        private Snowy() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$StoryTime;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StoryTime extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final StoryTime INSTANCE = new StoryTime();

        private StoryTime() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Storytime2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Storytime2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Storytime2 INSTANCE = new Storytime2();

        private Storytime2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Sunny;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sunny extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Sunny INSTANCE = new Sunny();

        private Sunny() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Sunny2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sunny2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Sunny2 INSTANCE = new Sunny2();

        private Sunny2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$TeaseMe;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TeaseMe extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final TeaseMe INSTANCE = new TeaseMe();

        private TeaseMe() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$TeaseMe2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TeaseMe2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final TeaseMe2 INSTANCE = new TeaseMe2();

        private TeaseMe2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$ThankYou;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ThankYou extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final ThankYou INSTANCE = new ThankYou();

        private ThankYou() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Tickets;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Tickets extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Tickets INSTANCE = new Tickets();

        private Tickets() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Timer;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Timer extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Timer INSTANCE = new Timer();

        private Timer() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Timer2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Timer2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Timer2 INSTANCE = new Timer2();

        private Timer2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Video;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Video extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Video INSTANCE = new Video();

        private Video() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Video2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Video2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Video2 INSTANCE = new Video2();

        private Video2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WarmEmpathetic;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WarmEmpathetic extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final WarmEmpathetic INSTANCE = new WarmEmpathetic();

        private WarmEmpathetic() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WarmEmpathetic2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WarmEmpathetic2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final WarmEmpathetic2 INSTANCE = new WarmEmpathetic2();

        private WarmEmpathetic2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WhatIsYourName;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WhatIsYourName extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final WhatIsYourName INSTANCE = new WhatIsYourName();

        private WhatIsYourName() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WhereAreYou;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WhereAreYou extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final WhereAreYou INSTANCE = new WhereAreYou();

        private WhereAreYou() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$WhereAreYou2;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WhereAreYou2 extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final WhereAreYou2 INSTANCE = new WhereAreYou2();

        private WhereAreYou2() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Windy;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Windy extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Windy INSTANCE = new Windy();

        private Windy() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType$Witty;", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Witty extends PersonalityBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Witty INSTANCE = new Witty();

        private Witty() {
            super(null);
        }
    }

    private PersonalityBambooChromeType() {
        super(TransitionalBambooChromeType.ProcessingToIdle.INSTANCE, null);
    }

    public /* synthetic */ PersonalityBambooChromeType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
