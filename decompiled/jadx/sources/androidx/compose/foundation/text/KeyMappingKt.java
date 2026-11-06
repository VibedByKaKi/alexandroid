package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m5802isCtrlPressedZmokQxo(((KeyEvent) obj).m5787unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1181mapZmokQxo(@NotNull android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m5804isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m5802isCtrlPressedZmokQxo(event)) {
                    long m5798getKeyZmokQxo = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1220getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1221getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1222getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1219getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m5802isCtrlPressedZmokQxo(event)) {
                    long m5798getKeyZmokQxo2 = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1220getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1221getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1222getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1219getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1224getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1218getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1214getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1213getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m5804isShiftPressedZmokQxo(event)) {
                    long m5798getKeyZmokQxo3 = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1227getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1226getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m5801isAltPressedZmokQxo(event)) {
                    long m5798getKeyZmokQxo4 = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo4, mappedKeys4.m1214getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo4, mappedKeys4.m1218getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo1181mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1181mapZmokQxo(@NotNull android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m5781boximpl(event)).booleanValue() && KeyEvent_androidKt.m5804isShiftPressedZmokQxo(event)) {
                    if (Key.m5490equalsimpl0(KeyEvent_androidKt.m5798getKeyZmokQxo(event), MappedKeys.INSTANCE.m1235getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m5781boximpl(event)).booleanValue()) {
                    long m5798getKeyZmokQxo = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1215getCEK5gGoQ()) ? true : Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1225getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1232getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1233getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1212getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1234getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1235getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m5802isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m5804isShiftPressedZmokQxo(event)) {
                    long m5798getKeyZmokQxo2 = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1220getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1221getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1222getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1219getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1229getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1228getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1227getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1226getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1225getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long m5798getKeyZmokQxo3 = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1220getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1221getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1222getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1219getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1229getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1228getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1227getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1226getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1223getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1214getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1218getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1230getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1217getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1216getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo3, mappedKeys3.m1231getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
