package com.amazon.alexa.hho.navigation.transit.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;", "", "<init>", "(Ljava/lang/String;I)V", "DEPART", "ARRIVE", "CONTINUE_STRAIGHT", "TURN", "LEFT_TURN", "RIGHT_TURN", "SHARP_TURN", "SHARP_LEFT_TURN", "SHARP_RIGHT_TURN", "SLIGHT_TURN", "SLIGHT_LEFT_TURN", "SLIGHT_RIGHT_TURN", "U_TURN", "LEFT_U_TURN", "RIGHT_U_TURN", "KEEP_MIDDLE", "KEEP_RIGHT", "KEEP_LEFT", "ENTER_HIGHWAY", "ENTER_HIGHWAY_RIGHT", "ENTER_HIGHWAY_LEFT", "EXIT", "EXIT_RIGHT", "EXIT_LEFT", "RAMP", "RAMP_RIGHT", "RAMP_LEFT", "ROUNDABOUT_PASS", "ROUNDABOUT_ENTER", "ROUNDABOUT_EXIT", "UNKNOWN", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationAction[] $VALUES;
    public static final NavigationAction DEPART = new NavigationAction("DEPART", 0);
    public static final NavigationAction ARRIVE = new NavigationAction("ARRIVE", 1);
    public static final NavigationAction CONTINUE_STRAIGHT = new NavigationAction("CONTINUE_STRAIGHT", 2);
    public static final NavigationAction TURN = new NavigationAction("TURN", 3);
    public static final NavigationAction LEFT_TURN = new NavigationAction("LEFT_TURN", 4);
    public static final NavigationAction RIGHT_TURN = new NavigationAction("RIGHT_TURN", 5);
    public static final NavigationAction SHARP_TURN = new NavigationAction("SHARP_TURN", 6);
    public static final NavigationAction SHARP_LEFT_TURN = new NavigationAction("SHARP_LEFT_TURN", 7);
    public static final NavigationAction SHARP_RIGHT_TURN = new NavigationAction("SHARP_RIGHT_TURN", 8);
    public static final NavigationAction SLIGHT_TURN = new NavigationAction("SLIGHT_TURN", 9);
    public static final NavigationAction SLIGHT_LEFT_TURN = new NavigationAction("SLIGHT_LEFT_TURN", 10);
    public static final NavigationAction SLIGHT_RIGHT_TURN = new NavigationAction("SLIGHT_RIGHT_TURN", 11);
    public static final NavigationAction U_TURN = new NavigationAction("U_TURN", 12);
    public static final NavigationAction LEFT_U_TURN = new NavigationAction("LEFT_U_TURN", 13);
    public static final NavigationAction RIGHT_U_TURN = new NavigationAction("RIGHT_U_TURN", 14);
    public static final NavigationAction KEEP_MIDDLE = new NavigationAction("KEEP_MIDDLE", 15);
    public static final NavigationAction KEEP_RIGHT = new NavigationAction("KEEP_RIGHT", 16);
    public static final NavigationAction KEEP_LEFT = new NavigationAction("KEEP_LEFT", 17);
    public static final NavigationAction ENTER_HIGHWAY = new NavigationAction("ENTER_HIGHWAY", 18);
    public static final NavigationAction ENTER_HIGHWAY_RIGHT = new NavigationAction("ENTER_HIGHWAY_RIGHT", 19);
    public static final NavigationAction ENTER_HIGHWAY_LEFT = new NavigationAction("ENTER_HIGHWAY_LEFT", 20);
    public static final NavigationAction EXIT = new NavigationAction("EXIT", 21);
    public static final NavigationAction EXIT_RIGHT = new NavigationAction("EXIT_RIGHT", 22);
    public static final NavigationAction EXIT_LEFT = new NavigationAction("EXIT_LEFT", 23);
    public static final NavigationAction RAMP = new NavigationAction("RAMP", 24);
    public static final NavigationAction RAMP_RIGHT = new NavigationAction("RAMP_RIGHT", 25);
    public static final NavigationAction RAMP_LEFT = new NavigationAction("RAMP_LEFT", 26);
    public static final NavigationAction ROUNDABOUT_PASS = new NavigationAction("ROUNDABOUT_PASS", 27);
    public static final NavigationAction ROUNDABOUT_ENTER = new NavigationAction("ROUNDABOUT_ENTER", 28);
    public static final NavigationAction ROUNDABOUT_EXIT = new NavigationAction("ROUNDABOUT_EXIT", 29);
    public static final NavigationAction UNKNOWN = new NavigationAction("UNKNOWN", 30);

    private static final /* synthetic */ NavigationAction[] $values() {
        return new NavigationAction[]{DEPART, ARRIVE, CONTINUE_STRAIGHT, TURN, LEFT_TURN, RIGHT_TURN, SHARP_TURN, SHARP_LEFT_TURN, SHARP_RIGHT_TURN, SLIGHT_TURN, SLIGHT_LEFT_TURN, SLIGHT_RIGHT_TURN, U_TURN, LEFT_U_TURN, RIGHT_U_TURN, KEEP_MIDDLE, KEEP_RIGHT, KEEP_LEFT, ENTER_HIGHWAY, ENTER_HIGHWAY_RIGHT, ENTER_HIGHWAY_LEFT, EXIT, EXIT_RIGHT, EXIT_LEFT, RAMP, RAMP_RIGHT, RAMP_LEFT, ROUNDABOUT_PASS, ROUNDABOUT_ENTER, ROUNDABOUT_EXIT, UNKNOWN};
    }

    static {
        NavigationAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private NavigationAction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NavigationAction> getEntries() {
        return $ENTRIES;
    }

    public static NavigationAction valueOf(String str) {
        return (NavigationAction) Enum.valueOf(NavigationAction.class, str);
    }

    public static NavigationAction[] values() {
        return (NavigationAction[]) $VALUES.clone();
    }
}
