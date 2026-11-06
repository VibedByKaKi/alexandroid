package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Role implements APLEnum {
    kRoleNone(0),
    kRoleAdjustable(1),
    kRoleAlert(2),
    kRoleButton(3),
    kRoleCheckBox(4),
    kRoleComboBox(5),
    kRoleHeader(6),
    kRoleImage(7),
    kRoleImageButton(8),
    kRoleKeyboardKey(9),
    kRoleLink(10),
    kRoleList(11),
    kRoleListItem(12),
    kRoleMenu(13),
    kRoleMenuBar(14),
    kRoleMenuItem(15),
    kRoleProgressBar(16),
    kRoleRadio(17),
    kRoleRadioGroup(18),
    kRoleScrollBar(19),
    kRoleSearch(20),
    kRoleSpinButton(21),
    kRoleSummary(22),
    kRoleSwitch(23),
    kRoleTab(24),
    kRoleTabList(25),
    kRoleText(26),
    kRoleTimer(27),
    kRoleToolBar(28);

    private static SparseArray<Role> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (Role role : values()) {
            values.put(role.getIndex(), role);
        }
    }

    Role(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static Role valueOf(int i) {
        return values.get(i);
    }
}
