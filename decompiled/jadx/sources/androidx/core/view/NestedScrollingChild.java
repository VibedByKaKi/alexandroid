package androidx.core.view;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
