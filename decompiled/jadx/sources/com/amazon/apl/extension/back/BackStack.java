package com.amazon.apl.extension.back;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.DocumentState;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BackStack {
    protected ArrayDeque<BackStackDocument> mDocuments = new ArrayDeque<>();

    public void addDocument(@NonNull BackStackDocument backStackDocument) {
        DocumentState documentState = backStackDocument.getDocumentState();
        if (documentState != null) {
            documentState.setOnBackstack(true);
        }
        this.mDocuments.addLast(backStackDocument);
    }

    public void clear() {
        while (true) {
            BackStackDocument poll = this.mDocuments.poll();
            if (poll == null) {
                return;
            } else {
                poll.finish();
            }
        }
    }

    public List<String> getDocumentIds() {
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackDocument> it2 = this.mDocuments.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getDocumentId());
        }
        return arrayList;
    }

    @VisibleForTesting
    public int indexOf(@NonNull String str) {
        int size = this.mDocuments.size() - 1;
        Iterator<BackStackDocument> descendingIterator = this.mDocuments.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (str.equals(descendingIterator.next().getDocumentId())) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public int length() {
        return this.mDocuments.size();
    }

    @Nullable
    public BackStackDocument popDocuments(int i) {
        ArrayDeque<BackStackDocument> arrayDeque;
        if (i < 0 || i > this.mDocuments.size()) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            arrayDeque = this.mDocuments;
            if (i2 >= i3) {
                break;
            }
            arrayDeque.removeLast().finish();
            i2++;
        }
        BackStackDocument removeLast = arrayDeque.removeLast();
        if (removeLast.getDocumentState() != null) {
            removeLast.getDocumentState().setOnBackstack(false);
        }
        return removeLast;
    }

    @Nullable
    public BackStackDocument popDocumentsAtIndex(int i) {
        if (i < 0) {
            i += this.mDocuments.size();
        }
        if (i < 0 || i >= this.mDocuments.size()) {
            return null;
        }
        return popDocuments(this.mDocuments.size() - i);
    }

    @Nullable
    public BackStackDocument popDocuments(@NonNull String str) {
        int indexOf = indexOf(str);
        if (indexOf == -1) {
            return null;
        }
        return popDocumentsAtIndex(indexOf);
    }
}
