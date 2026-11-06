package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import dagger.internal.codegen.base.Formatter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import org.apache.logging.log4j.message.StructuredDataId;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"LogConditional"})
/* loaded from: classes13.dex */
public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream = System.out;
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str2, "     ");
            m1m.append(getName(childAt));
            printStream.println(m1m.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals(StructuredDataId.RESERVED)) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "------------- ");
        m1m.append(cls.getName());
        m1m.append(" --------------------");
        printStream.println(m1m.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals(StructuredDataId.RESERVED)) && ((!(obj2 instanceof Integer) || !obj2.toString().equals(Constants.FEEDBACK_TYPE_DISLIKE)) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + Formatter.INDENT + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder m1m2 = a$$ExternalSyntheticOutline0.m1m(str, "------------- ");
        m1m2.append(cls.getSimpleName());
        m1m2.append(" --------------------");
        printStream2.println(m1m2.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i) {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[i + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        try {
            String str2 = iArr.length + MarkdownConstants.LEFT_BRACKET;
            int i = 0;
            while (i < iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(iArr[i]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + iArr[i] + " ";
                }
                str2 = sb2 + str;
                i++;
            }
            return str2 + MarkdownConstants.RIGHT_BRACKET;
        } catch (Exception e) {
            e.toString();
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i2) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static void logStack(String str, String str2, int i) {
        StackTraceElement[] m = AppLaunchChecker$$ExternalSyntheticOutline0.m();
        int min = Math.min(i, m.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = m[i2];
            StringBuilder sb = new StringBuilder(".(");
            sb.append(m[i2].getFileName());
            sb.append(":");
            sb.append(m[i2].getLineNumber());
            sb.append(") ");
            sb.append(m[i2].getMethodName());
            str3 = str3.concat(" ");
        }
    }

    public static void printStack(String str, int i) {
        StackTraceElement[] m = AppLaunchChecker$$ExternalSyntheticOutline0.m();
        int min = Math.min(i, m.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = m[i2];
            String str3 = ".(" + m[i2].getFileName() + ":" + m[i2].getLineNumber() + ") ";
            str2 = str2.concat(" ");
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static String getState(MotionLayout motionLayout, int i) {
        return getState(motionLayout, i, -1);
    }

    public static String getName(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return a$$ExternalSyntheticOutline0.m(i, "?");
            }
        }
        return "UNKNOWN";
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        PrintStream printStream = System.out;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m(" >>>>>>>>>>>>>>>>>>. dump ", str2, "  ");
        m2m.append(layoutParams.getClass().getName());
        printStream.println(m2m.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals(StructuredDataId.RESERVED)) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump ".concat(str2));
    }
}
