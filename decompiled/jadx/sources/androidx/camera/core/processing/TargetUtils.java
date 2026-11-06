package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(@NonNull Collection<Integer> collection, int i) {
        boolean contains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        Preconditions.checkArgument(contains, a$$ExternalSyntheticOutline0.m("Effects target ", getHumanReadableName(i), " is not in the supported list ", getHumanReadableNames(collection), "."));
    }

    @NonNull
    public static String getHumanReadableName(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    @NonNull
    private static String getHumanReadableNames(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(getHumanReadableName(it2.next().intValue()));
        }
        return MarkdownConstants.LEFT_BRACKET + String.join(", ", arrayList) + MarkdownConstants.RIGHT_BRACKET;
    }

    public static int getNumberOfTargets(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>= 1;
        }
        return i2;
    }

    public static boolean isSuperset(int i, int i2) {
        return (i & i2) == i2;
    }
}
