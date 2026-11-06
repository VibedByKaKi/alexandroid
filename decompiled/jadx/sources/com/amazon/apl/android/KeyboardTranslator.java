package com.amazon.apl.android;

import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.amazon.alexa.accessory.notificationpublisher.parser.BaseCustomAppParser;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.mobile.assistant.capabilities.localsearch.LocalSearchEngineCapabilityAgent;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.voice.ui.widget.AnimationMetrics;
import com.amazon.apl.enums.KeyHandlerType;
import com.amazon.apl.extension.back.BackExtension;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Map;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class KeyboardTranslator {
    private static final String TAG = "KeyboardTranslator";
    private static final KeyboardTranslator INSTANCE = new KeyboardTranslator();
    private static final Map<Integer, APLKey> sAndroidKeyToAPLKeyMap = new ArrayMap(288);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class APLKey {

        @NonNull
        final String code;

        @NonNull
        final String keyName;

        public APLKey(@NonNull String str, @NonNull String str2) {
            this.code = str;
            this.keyName = str2;
        }
    }

    static {
        put(1, new APLKey("SoftLeft", "SoftLeft"));
        put(2, new APLKey("SoftRight", "SoftRight"));
        put(3, new APLKey("Home", "Home"));
        put(4, new APLKey("Back", "Back"));
        put(5, new APLKey("Call", "Call"));
        put(6, new APLKey("EndCall", "EndCall"));
        put(7, new APLKey("Digit0", "*"));
        put(8, new APLKey("Digit1", "*"));
        put(9, new APLKey("Digit2", "*"));
        put(10, new APLKey("Digit3", "*"));
        put(11, new APLKey("Digit4", "*"));
        put(12, new APLKey("Digit5", "*"));
        put(13, new APLKey("Digit6", "*"));
        put(14, new APLKey("Digit7", "*"));
        put(15, new APLKey("Digit8", "*"));
        put(16, new APLKey("Digit9", "*"));
        put(17, new APLKey("Star", "*"));
        put(18, new APLKey("Pound", "*"));
        put(19, new APLKey("ArrowUp", "ArrowUp"));
        put(20, new APLKey("ArrowDown", "ArrowDown"));
        put(21, new APLKey("ArrowLeft", "ArrowLeft"));
        put(22, new APLKey("ArrowRight", "ArrowRight"));
        put(23, new APLKey(ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE));
        put(24, new APLKey("VolumeUp", "VolumeUp"));
        put(25, new APLKey("VolumeDown", "VolumeDown"));
        put(26, new APLKey("Power", "Power"));
        put(27, new APLKey("Camera", "Camera"));
        put(28, new APLKey(BackExtension.COMMAND_CLEAR_NAME, BackExtension.COMMAND_CLEAR_NAME));
        put(29, new APLKey("KeyA", "*"));
        put(30, new APLKey("KeyB", "*"));
        put(31, new APLKey("KeyC", "*"));
        put(32, new APLKey("KeyD", "*"));
        put(33, new APLKey("KeyE", "*"));
        put(34, new APLKey("KeyF", "*"));
        put(35, new APLKey("KeyG", "*"));
        put(36, new APLKey("KeyH", "*"));
        put(37, new APLKey("KeyI", "*"));
        put(38, new APLKey("KeyJ", "*"));
        put(39, new APLKey("KeyK", "*"));
        put(40, new APLKey("KeyL", "*"));
        put(41, new APLKey("KeyM", "*"));
        put(42, new APLKey("KeyN", "*"));
        put(43, new APLKey("KeyO", "*"));
        put(44, new APLKey("KeyP", "*"));
        put(45, new APLKey("KeyQ", "*"));
        put(46, new APLKey("KeyR", "*"));
        put(47, new APLKey("KeyS", "*"));
        put(48, new APLKey("KeyT", "*"));
        put(49, new APLKey("KeyU", "*"));
        put(50, new APLKey("KeyV", "*"));
        put(51, new APLKey("KeyW", "*"));
        put(52, new APLKey("KeyX", "*"));
        put(53, new APLKey("KeyY", "*"));
        put(54, new APLKey("KeyZ", "*"));
        put(55, new APLKey("Comma", "*"));
        put(56, new APLKey("Period", "*"));
        put(57, new APLKey("Alt", "Alt"));
        put(58, new APLKey("Alt", "Alt"));
        put(59, new APLKey("Shift", "Shift"));
        put(60, new APLKey("Shift", "Shift"));
        put(61, new APLKey("Tab", "Tab"));
        put(62, new APLKey("Space", "Space"));
        put(63, new APLKey("Sym", "Sym"));
        put(64, new APLKey("Explorer", "Explorer"));
        put(65, new APLKey("Envelope", "Envelope"));
        put(66, new APLKey(ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE));
        put(67, new APLKey(ReactEditTextInputConnectionWrapper.BACKSPACE_KEY_VALUE, ReactEditTextInputConnectionWrapper.BACKSPACE_KEY_VALUE));
        put(68, new APLKey("Backquote", "*"));
        put(69, new APLKey("Minus", "*"));
        put(70, new APLKey("Equal", "*"));
        put(71, new APLKey("BracketLeft", "*"));
        put(72, new APLKey("BracketRight", "*"));
        put(73, new APLKey("Backslash", "*"));
        put(74, new APLKey("Semicolon", "*"));
        put(75, new APLKey("Quote", "*"));
        put(76, new APLKey("Slash", "*"));
        put(77, new APLKey("At", "*"));
        put(78, new APLKey("Num", "Num"));
        put(79, new APLKey("HeadsetHook", "HeadsetHook"));
        put(80, new APLKey("Focus", "Focus"));
        put(81, new APLKey("Plus", "*"));
        put(82, new APLKey("Menu", "Menu"));
        put(83, new APLKey("Notification", "Notification"));
        put(84, new APLKey(LocalSearchEngineCapabilityAgent.SEARCH_DIRECTIVE, LocalSearchEngineCapabilityAgent.SEARCH_DIRECTIVE));
        put(85, new APLKey("MediaPlayPause", "MediaPlayPause"));
        put(86, new APLKey("MediaStop", "MediaStop"));
        put(87, new APLKey("MediaNext", "MediaNext"));
        put(88, new APLKey("MediaPrevious", "MediaPrevious"));
        put(89, new APLKey("MediaRewind", "MediaRewind"));
        put(90, new APLKey("MediaFastForward", "MediaFastForward"));
        put(91, new APLKey("Mute", "Mute"));
        put(92, new APLKey("PageUp", "PageUp"));
        put(93, new APLKey("PageDown", "PageDown"));
        put(94, new APLKey("PictSymbols", "PictSymbols"));
        put(95, new APLKey("SwitchCharset", "SwitchCharset"));
        put(96, new APLKey("ButtonA", "ButtonA"));
        put(97, new APLKey("ButtonB", "ButtonB"));
        put(98, new APLKey("ButtonC", "ButtonC"));
        put(99, new APLKey("ButtonX", "ButtonX"));
        put(100, new APLKey("ButtonY", "ButtonY"));
        put(101, new APLKey("ButtonZ", "ButtonZ"));
        put(102, new APLKey("ButtonL1", "ButtonL1"));
        put(103, new APLKey("ButtonR1", "ButtonR1"));
        put(104, new APLKey("ButtonL2", "ButtonL2"));
        put(105, new APLKey("ButtonR2", "ButtonR2"));
        put(106, new APLKey("ButtonThumbL", "ButtonThumbL"));
        put(107, new APLKey("ButtonThumbR", "ButtonThumbR"));
        put(108, new APLKey("ButtonStart", "ButtonStart"));
        put(109, new APLKey("ButtonSelect", "ButtonSelect"));
        put(110, new APLKey("ButtonMode", "ButtonMode"));
        put(111, new APLKey("Escape", "Escape"));
        put(112, new APLKey("ForwardDel", "ForwardDel"));
        put(113, new APLKey("Ctrl", "Ctrl"));
        put(114, new APLKey("Ctrl", "Ctrl"));
        put(115, new APLKey("CapsLock", "CapsLock"));
        put(116, new APLKey("ScrollLock", "ScrollLock"));
        put(117, new APLKey("Meta", "Meta"));
        put(118, new APLKey("Meta", "Meta"));
        put(119, new APLKey("Function", "Function"));
        put(120, new APLKey("SysRq", "SysRq"));
        put(121, new APLKey("Break", "Break"));
        put(122, new APLKey("Home", "Home"));
        put(123, new APLKey("End", "End"));
        put(124, new APLKey("Insert", "Insert"));
        put(125, new APLKey("Forward", "Forward"));
        put(126, new APLKey("MediaPlay", "MediaPlay"));
        put(127, new APLKey("MediaPause", "MediaPause"));
        put(128, new APLKey("MediaClose", "MediaClose"));
        put(129, new APLKey("MediaEject", "MediaEject"));
        put(130, new APLKey("MediaRecord", "MediaRecord"));
        put(131, new APLKey("F1", "F1"));
        put(132, new APLKey("F2", "F2"));
        put(133, new APLKey("F3", "F3"));
        put(134, new APLKey("F4", "F4"));
        put(135, new APLKey("F5", "F5"));
        put(136, new APLKey("F6", "F6"));
        put(137, new APLKey("F7", "F7"));
        put(138, new APLKey("F8", "F8"));
        put(139, new APLKey("F9", "F9"));
        put(140, new APLKey("F10", "F10"));
        put(141, new APLKey("F11", "F11"));
        put(142, new APLKey("F12", "F12"));
        put(143, new APLKey("NumLock", "NumLock"));
        put(144, new APLKey("Numpad0", "*"));
        put(145, new APLKey("Numpad1", "*"));
        put(146, new APLKey("Numpad2", "*"));
        put(147, new APLKey("Numpad3", "*"));
        put(148, new APLKey("Numpad4", "*"));
        put(149, new APLKey("Numpad5", "*"));
        put(150, new APLKey("Numpad6", "*"));
        put(151, new APLKey("Numpad7", "*"));
        put(152, new APLKey("Numpad8", "*"));
        put(153, new APLKey("Numpad9", "*"));
        put(154, new APLKey("NumpadDivide", "*"));
        put(155, new APLKey("NumpadMultiply", "*"));
        put(156, new APLKey("NumpadSubstract", "*"));
        put(157, new APLKey("NumpadAdd", "*"));
        put(158, new APLKey("NumpadDot", "*"));
        put(159, new APLKey("NumpadComma", "*"));
        put(160, new APLKey(ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE));
        put(161, new APLKey("NumpadEquals", "*"));
        put(162, new APLKey("NumpadLeftParen", "*"));
        put(163, new APLKey("NumpadRightParen", "*"));
        put(164, new APLKey("VolumeMute", "VolumeMute"));
        put(165, new APLKey("Info", "Info"));
        put(166, new APLKey("ChannelUp", "ChannelUp"));
        put(167, new APLKey("ChannelDown", "ChannelDown"));
        put(168, new APLKey("ZoomIn", "ZoomIn"));
        put(169, new APLKey("ZoomOut", "ZoomOut"));
        put(170, new APLKey("TV", "TV"));
        put(171, new APLKey("Window", "Window"));
        put(172, new APLKey("Guide", "Guide"));
        put(173, new APLKey("DVR", "DVR"));
        put(174, new APLKey("Bookmark", "Bookmark"));
        put(175, new APLKey("Captions", "Captions"));
        put(176, new APLKey(MetricsConstants.UserInteractionMetrics.SETTINGS_PREFIX, MetricsConstants.UserInteractionMetrics.SETTINGS_PREFIX));
        put(177, new APLKey("TVPower", "TVPower"));
        put(178, new APLKey("TVInput", "TVInput"));
        put(179, new APLKey("STBPower", "STBPower"));
        put(180, new APLKey("STBInput", "STBInput"));
        put(181, new APLKey("AVRPower", "AVRPower"));
        put(182, new APLKey("AVTInput", "AVTInput"));
        put(183, new APLKey("ProgRed", "ProgRed"));
        put(184, new APLKey("ProgGreen", "ProgGreen"));
        put(185, new APLKey("ProgYellow", "ProgYellow"));
        put(186, new APLKey("ProgBlue", "ProgBlue"));
        put(187, new APLKey("AppSwitch", "AppSwitch"));
        put(188, new APLKey("Button1", "Button1"));
        put(189, new APLKey("Button2", "Button2"));
        put(190, new APLKey("Button3", "Button3"));
        put(191, new APLKey("Button4", "Button4"));
        put(192, new APLKey("Button5", "Button5"));
        put(193, new APLKey("Button6", "Button6"));
        put(194, new APLKey("Button7", "Button7"));
        put(195, new APLKey("Button8", "Button8"));
        put(ByteCodes.wide, new APLKey("Button9", "Button9"));
        put(197, new APLKey("Button10", "Button10"));
        put(198, new APLKey("Button11", "Button11"));
        put(199, new APLKey("Button12", "Button12"));
        put(200, new APLKey("Button13", "Button13"));
        put(201, new APLKey("Button14", "Button14"));
        put(202, new APLKey("Button15", "Button15"));
        put(203, new APLKey("Button16", "Button16"));
        put(204, new APLKey("LanguageSwitch", "LanguageSwitch"));
        put(205, new APLKey("MannerCode", "MannerCode"));
        put(206, new APLKey("3DMode", "3DMode"));
        put(207, new APLKey(ContactProviderContract.ContactDatabaseEntry.TABLE_NAME, ContactProviderContract.ContactDatabaseEntry.TABLE_NAME));
        put(JfifUtil.MARKER_RST0, new APLKey(BaseCustomAppParser.CALENDAR_APP_CATEGORY, BaseCustomAppParser.CALENDAR_APP_CATEGORY));
        put(209, new APLKey("Music", "Music"));
        put(210, new APLKey("Calculator", "Calculator"));
        put(211, new APLKey("ZenkakuHankuku", "ZenkakuHankuku"));
        put(FTPReply.DIRECTORY_STATUS, new APLKey("Eisu", "Eisu"));
        put(FTPReply.FILE_STATUS, new APLKey("Muhenkan", "Muhenkan"));
        put(214, new APLKey("Henkan", "Henkan"));
        put(215, new APLKey("KatakanaHiragana", "KatakanaHiragana"));
        put(JfifUtil.MARKER_SOI, new APLKey("Yen", "Yen"));
        put(JfifUtil.MARKER_EOI, new APLKey("Ro", "Ro"));
        put(JfifUtil.MARKER_SOS, new APLKey("Kana", "Kana"));
        put(219, new APLKey("Assist", "Assist"));
        put(220, new APLKey("BrightnessDown", "BrightnessDown"));
        put(221, new APLKey("BrightnessUp", "BrightnessUp"));
        put(NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, new APLKey("MediaAudioTrack", "MediaAudioTrack"));
        put(NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, new APLKey("Sleep", "Sleep"));
        put(224, new APLKey("WakeUp", "WakeUp"));
        put(225, new APLKey("Pairing", "Pairing"));
        put(FTPReply.CLOSING_DATA_CONNECTION, new APLKey("MediaTopMenu", "MediaTopMenu"));
        put(FTPReply.ENTERING_PASSIVE_MODE, new APLKey("11", "11"));
        put(228, new APLKey("12", "12"));
        put(FTPReply.ENTERING_EPSV_MODE, new APLKey("LastChannel", "LastChannel"));
        put(230, new APLKey("TVDataService", "TVDataService"));
        put(231, new APLKey("VoiceAssist", "VoiceAssist"));
        put(232, new APLKey("TVRadioService", "TVRadioService"));
        put(233, new APLKey("TVTeletext", "TVTeletext"));
        put(FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE, new APLKey("TVNumberEntry", "TVNumberEntry"));
        put(235, new APLKey("TVTerrestrialAnalog", "TVTerrestrialAnalog"));
        put(TelnetCommand.EOF, new APLKey("TVTerrestrialDigital", "TVTerrestrialDigital"));
        put(TelnetCommand.SUSP, new APLKey("TVSatellite", "TVSatellite"));
        put(TelnetCommand.ABORT, new APLKey("TVSatelliteBS", "TVSatelliteBS"));
        put(TelnetCommand.EOR, new APLKey("TVSatelliteCS", "TVSatelliteCS"));
        put(240, new APLKey("TVSatelliteService", "TVSatelliteService"));
        put(TelnetCommand.NOP, new APLKey("TVNetwork", "TVNetwork"));
        put(242, new APLKey("TVAntennaCable", "TVAntennaCable"));
        put(TelnetCommand.BREAK, new APLKey("TVInputHDMI1", "TVInputHDMI1"));
        put(TelnetCommand.IP, new APLKey("TVInputHDMI2", "TVInputHDMI2"));
        put(TelnetCommand.AO, new APLKey("TVInputHDMI3", "TVInputHDMI3"));
        put(TelnetCommand.AYT, new APLKey("TVInputHDMI4", "TVInputHDMI4"));
        put(TelnetCommand.EC, new APLKey("TVInputComposite1", "TVInputComposite1"));
        put(TelnetCommand.EL, new APLKey("TVInputComposite2", "TVInputComposite2"));
        put(TelnetCommand.GA, new APLKey("TVInputComponent1", "TVInputComponent1"));
        put(250, new APLKey("TVInputComponent2", "TVInputComponent2"));
        put(251, new APLKey("TVInputVGA1", "TVInputVGA1"));
        put(TelnetCommand.WONT, new APLKey("TVAudioDescription", "TVAudioDescription"));
        put(TelnetCommand.DO, new APLKey("TVAudioDescriptionMixUp", "TVAudioDescriptionMixUp"));
        put(TelnetCommand.DONT, new APLKey("TVAudioDescriptionMixDown", "TVAudioDescriptionMixDown"));
        put(255, new APLKey("TVZoomMode", "TVZoomMode"));
        put(256, new APLKey("TVContentsMenu", "TVContentsMenu"));
        put(257, new APLKey("TVMediaContextMenu", "TVMediaContextMenu"));
        put(ByteCodes.bool_and, new APLKey("TVTimerProgramming", "TVTimerProgramming"));
        put(ByteCodes.bool_or, new APLKey("Help", "Help"));
        put(260, new APLKey("NavigatePrevious", "NavigatePrevious"));
        put(261, new APLKey("NavigateNext", "NavigateNext"));
        put(262, new APLKey("NavigateIn", "NavigateIn"));
        put(263, new APLKey("NavigateOut", "NavigateOut"));
        put(264, new APLKey("StemPrimary", "StemPrimary"));
        put(265, new APLKey("Stem1", "Stem1"));
        put(AnimationMetrics.ThinkingState.SECOND_OPACITY_ANIMATOR_DURATION, new APLKey("Stem2", "Stem2"));
        put(267, new APLKey("Stem3", "Stem3"));
        put(268, new APLKey("ArrowUpLeft", "ArrowUpLeft"));
        put(269, new APLKey("ArrowDownLeft", "ArrowDownLeft"));
        put(270, new APLKey("ArrowUpRight", "ArrowUpRight"));
        put(ByteCodes.lshll, new APLKey("ArrowDownRight", "ArrowDownRight"));
        put(ByteCodes.ishrl, new APLKey("MediaSkipForward", "MediaSkipForward"));
        put(ByteCodes.lshrl, new APLKey("MediaSkipBackward", "MediaSkipBackward"));
        put(274, new APLKey("MediaStepForward", "MediaStepForward"));
        put(ByteCodes.lushrl, new APLKey("MediaStepBackward", "MediaStepBackward"));
        put(ByteCodes.nullchk, new APLKey("SoftSleep", "SoftSleep"));
        put(ByteCodes.error, new APLKey("Cut", "Cut"));
        put(278, new APLKey("Copy", "Copy"));
        put(279, new APLKey("Paste", "Paste"));
        put(280, new APLKey("ArrowUp", "ArrowUp"));
        put(NNTPReply.AUTHENTICATION_ACCEPTED, new APLKey("ArrowDown", "ArrowDown"));
        put(282, new APLKey("ArrowLeft", "ArrowLeft"));
        put(283, new APLKey("ArrowRight", "ArrowRight"));
        put(284, new APLKey("AllApps", "AllApps"));
        put(285, new APLKey("Refresh", "Refresh"));
        put(286, new APLKey(Constants.FEEDBACK_POSITIVE_OPTION_TEXT, Constants.FEEDBACK_POSITIVE_OPTION_TEXT));
        put(287, new APLKey(Constants.FEEDBACK_NEGATIVE_OPTION_TEXT, Constants.FEEDBACK_NEGATIVE_OPTION_TEXT));
        put(288, new APLKey("ProfileSwitch", "ProfileSwitch"));
    }

    private KeyboardTranslator() {
    }

    @NonNull
    private String getCode(@NonNull KeyEvent keyEvent) {
        APLKey aPLKey = sAndroidKeyToAPLKeyMap.get(Integer.valueOf(keyEvent.getKeyCode()));
        return aPLKey != null ? aPLKey.code : "";
    }

    public static final KeyboardTranslator getInstance() {
        return INSTANCE;
    }

    @NonNull
    private String getKey(@NonNull KeyEvent keyEvent) {
        APLKey aPLKey = sAndroidKeyToAPLKeyMap.get(Integer.valueOf(keyEvent.getKeyCode()));
        return aPLKey == null ? "" : "*".equals(aPLKey.keyName) ? String.valueOf((char) keyEvent.getUnicodeChar()) : aPLKey.keyName;
    }

    private static void put(int i, APLKey aPLKey) {
        sAndroidKeyToAPLKeyMap.put(Integer.valueOf(i), aPLKey);
    }

    @Nullable
    public APLKeyboard translate(@Nullable KeyEvent keyEvent) {
        if (keyEvent == null) {
            Log.w(TAG, " Event must be non-null. Discard APL Key Event.");
            return null;
        }
        String key = getKey(keyEvent);
        String code = getCode(keyEvent);
        if (!key.equals("") && !code.equals("")) {
            return APLKeyboard.builder().type(keyEvent.getAction() != 1 ? KeyHandlerType.kKeyDown : KeyHandlerType.kKeyUp).key(key).code(code).repeat(keyEvent.getRepeatCount() > 0).shift(keyEvent.isShiftPressed()).alt(keyEvent.isAltPressed()).ctrl(keyEvent.isCtrlPressed()).meta(keyEvent.isMetaPressed()).build();
        }
        Log.w(TAG, "Key could not be found. Android key: " + keyEvent.getKeyCode() + ", code: " + keyEvent.getKeyCode());
        return null;
    }
}
