package org.apache.commons.net.nntp;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Threader {
    private void buildContainer(Threadable threadable, HashMap<String, ThreadContainer> hashMap) {
        String messageThreadId = threadable.messageThreadId();
        ThreadContainer threadContainer = hashMap.get(messageThreadId);
        if (threadContainer != null) {
            if (threadContainer.threadable != null) {
                messageThreadId = a$$ExternalSyntheticOutline0.m(1, "<Bogus-id:", ">");
                threadContainer = null;
            } else {
                threadContainer.threadable = threadable;
            }
        }
        if (threadContainer == null) {
            threadContainer = new ThreadContainer();
            threadContainer.threadable = threadable;
            hashMap.put(messageThreadId, threadContainer);
        }
        String[] messageThreadReferences = threadable.messageThreadReferences();
        int length = messageThreadReferences.length;
        int i = 0;
        ThreadContainer threadContainer2 = null;
        while (i < length) {
            String str = messageThreadReferences[i];
            ThreadContainer threadContainer3 = hashMap.get(str);
            if (threadContainer3 == null) {
                threadContainer3 = new ThreadContainer();
                hashMap.put(str, threadContainer3);
            }
            if (threadContainer2 != null && threadContainer3.parent == null && threadContainer2 != threadContainer3 && !threadContainer3.findChild(threadContainer2)) {
                threadContainer3.parent = threadContainer2;
                threadContainer3.next = threadContainer2.child;
                threadContainer2.child = threadContainer3;
            }
            i++;
            threadContainer2 = threadContainer3;
        }
        if (threadContainer2 != null && (threadContainer2 == threadContainer || threadContainer.findChild(threadContainer2))) {
            threadContainer2 = null;
        }
        ThreadContainer threadContainer4 = threadContainer.parent;
        if (threadContainer4 != null) {
            ThreadContainer threadContainer5 = threadContainer4.child;
            ThreadContainer threadContainer6 = null;
            while (threadContainer5 != null && threadContainer5 != threadContainer) {
                threadContainer6 = threadContainer5;
                threadContainer5 = threadContainer5.next;
            }
            if (threadContainer5 == null) {
                StringBuilder sb = new StringBuilder("Didnt find ");
                sb.append(threadContainer);
                ThreadContainer threadContainer7 = threadContainer.parent;
                sb.append(" in parent");
                sb.append(threadContainer7);
                throw new RuntimeException(sb.toString());
            }
            if (threadContainer6 == null) {
                threadContainer.parent.child = threadContainer.next;
            } else {
                threadContainer6.next = threadContainer.next;
            }
            threadContainer.next = null;
            threadContainer.parent = null;
        }
        if (threadContainer2 != null) {
            threadContainer.parent = threadContainer2;
            threadContainer.next = threadContainer2.child;
            threadContainer2.child = threadContainer;
        }
    }

    private ThreadContainer findRootSet(HashMap<String, ThreadContainer> hashMap) {
        ThreadContainer threadContainer = new ThreadContainer();
        Iterator<Map.Entry<String, ThreadContainer>> it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ThreadContainer value = it2.next().getValue();
            if (value.parent == null) {
                if (value.next != null) {
                    throw new RuntimeException("c.next is " + value.next.toString());
                }
                value.next = threadContainer.child;
                threadContainer.child = value;
            }
        }
        return threadContainer;
    }

    private void gatherSubjects(ThreadContainer threadContainer) {
        ThreadContainer threadContainer2;
        Threadable threadable;
        ThreadContainer threadContainer3;
        Threadable threadable2;
        Threadable threadable3;
        int i = 0;
        int i2 = 0;
        for (ThreadContainer threadContainer4 = threadContainer.child; threadContainer4 != null; threadContainer4 = threadContainer4.next) {
            i2++;
        }
        HashMap hashMap = new HashMap((int) (i2 * 1.2d), 0.9f);
        for (ThreadContainer threadContainer5 = threadContainer.child; threadContainer5 != null; threadContainer5 = threadContainer5.next) {
            Threadable threadable4 = threadContainer5.threadable;
            if (threadable4 == null) {
                threadable4 = threadContainer5.child.threadable;
            }
            String simplifiedSubject = threadable4.simplifiedSubject();
            if (simplifiedSubject != null && !simplifiedSubject.isEmpty() && ((threadContainer3 = (ThreadContainer) hashMap.get(simplifiedSubject)) == null || ((threadContainer5.threadable == null && threadContainer3.threadable != null) || ((threadable2 = threadContainer3.threadable) != null && threadable2.subjectIsReply() && (threadable3 = threadContainer5.threadable) != null && !threadable3.subjectIsReply())))) {
                hashMap.put(simplifiedSubject, threadContainer5);
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        ThreadContainer threadContainer6 = threadContainer.child;
        ThreadContainer threadContainer7 = threadContainer6.next;
        ThreadContainer threadContainer8 = null;
        while (threadContainer6 != null) {
            Threadable threadable5 = threadContainer6.threadable;
            if (threadable5 == null) {
                threadable5 = threadContainer6.child.threadable;
            }
            String simplifiedSubject2 = threadable5.simplifiedSubject();
            if (simplifiedSubject2 == null || simplifiedSubject2.isEmpty() || (threadContainer2 = (ThreadContainer) hashMap.get(simplifiedSubject2)) == threadContainer6) {
                threadContainer8 = threadContainer6;
            } else {
                ThreadContainer threadContainer9 = threadContainer6.next;
                if (threadContainer8 == null) {
                    threadContainer.child = threadContainer9;
                } else {
                    threadContainer8.next = threadContainer9;
                }
                threadContainer6.next = null;
                Threadable threadable6 = threadContainer2.threadable;
                if (threadable6 == null && threadContainer6.threadable == null) {
                    ThreadContainer threadContainer10 = threadContainer2.child;
                    while (threadContainer10 != null) {
                        ThreadContainer threadContainer11 = threadContainer10.next;
                        if (threadContainer11 == null) {
                            break;
                        } else {
                            threadContainer10 = threadContainer11;
                        }
                    }
                    if (threadContainer10 != null) {
                        threadContainer10.next = threadContainer6.child;
                    }
                    for (ThreadContainer threadContainer12 = threadContainer6.child; threadContainer12 != null; threadContainer12 = threadContainer12.next) {
                        threadContainer12.parent = threadContainer2;
                    }
                    threadContainer6.child = null;
                } else if (threadable6 == null || !((threadable = threadContainer6.threadable) == null || !threadable.subjectIsReply() || threadContainer2.threadable.subjectIsReply())) {
                    threadContainer6.parent = threadContainer2;
                    threadContainer6.next = threadContainer2.child;
                    threadContainer2.child = threadContainer6;
                } else {
                    ThreadContainer threadContainer13 = new ThreadContainer();
                    threadContainer13.threadable = threadContainer2.threadable;
                    ThreadContainer threadContainer14 = threadContainer2.child;
                    threadContainer13.child = threadContainer14;
                    while (threadContainer14 != null) {
                        threadContainer14.parent = threadContainer13;
                        threadContainer14 = threadContainer14.next;
                    }
                    threadContainer2.threadable = null;
                    threadContainer6.parent = threadContainer2;
                    threadContainer13.parent = threadContainer2;
                    threadContainer2.child = threadContainer6;
                    threadContainer6.next = threadContainer13;
                }
            }
            ThreadContainer threadContainer15 = threadContainer7;
            threadContainer7 = threadContainer7 == null ? null : threadContainer7.next;
            threadContainer6 = threadContainer15;
        }
        hashMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pruneEmptyContainers(org.apache.commons.net.nntp.ThreadContainer r8) {
        /*
            r7 = this;
            org.apache.commons.net.nntp.ThreadContainer r0 = r8.child
            org.apache.commons.net.nntp.ThreadContainer r1 = r0.next
            r2 = 0
            r3 = r2
        L6:
            if (r0 == 0) goto L53
            org.apache.commons.net.nntp.Threadable r4 = r0.threadable
            if (r4 != 0) goto L1b
            org.apache.commons.net.nntp.ThreadContainer r5 = r0.child
            if (r5 != 0) goto L1b
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            if (r3 != 0) goto L17
            r8.child = r0
            goto L19
        L17:
            r3.next = r0
        L19:
            r0 = r1
            goto L4c
        L1b:
            if (r4 != 0) goto L43
            org.apache.commons.net.nntp.ThreadContainer r4 = r0.child
            if (r4 == 0) goto L43
            org.apache.commons.net.nntp.ThreadContainer r5 = r0.parent
            if (r5 != 0) goto L29
            org.apache.commons.net.nntp.ThreadContainer r5 = r4.next
            if (r5 != 0) goto L43
        L29:
            if (r3 != 0) goto L2e
            r8.child = r4
            goto L30
        L2e:
            r3.next = r4
        L30:
            r1 = r4
        L31:
            org.apache.commons.net.nntp.ThreadContainer r5 = r1.next
            org.apache.commons.net.nntp.ThreadContainer r6 = r0.parent
            if (r5 == 0) goto L3b
            r1.parent = r6
            r1 = r5
            goto L31
        L3b:
            r1.parent = r6
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            r1.next = r0
            r0 = r4
            goto L4c
        L43:
            org.apache.commons.net.nntp.ThreadContainer r3 = r0.child
            if (r3 == 0) goto L4a
            r7.pruneEmptyContainers(r0)
        L4a:
            r3 = r0
            goto L19
        L4c:
            if (r0 != 0) goto L50
            r1 = r2
            goto L6
        L50:
            org.apache.commons.net.nntp.ThreadContainer r1 = r0.next
            goto L6
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.nntp.Threader.pruneEmptyContainers(org.apache.commons.net.nntp.ThreadContainer):void");
    }

    public Threadable thread(Iterable<? extends Threadable> iterable) {
        if (iterable == null) {
            return null;
        }
        HashMap<String, ThreadContainer> hashMap = new HashMap<>();
        for (Threadable threadable : iterable) {
            if (!threadable.isDummy()) {
                buildContainer(threadable, hashMap);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        ThreadContainer findRootSet = findRootSet(hashMap);
        hashMap.clear();
        pruneEmptyContainers(findRootSet);
        findRootSet.reverseChildren();
        gatherSubjects(findRootSet);
        if (findRootSet.next != null) {
            CrlID$$ExternalSyntheticBUOutline0.m((Object) findRootSet, "root node has a next:");
            return null;
        }
        for (ThreadContainer threadContainer = findRootSet.child; threadContainer != null; threadContainer = threadContainer.next) {
            if (threadContainer.threadable == null) {
                threadContainer.threadable = threadContainer.child.threadable.makeDummy();
            }
        }
        ThreadContainer threadContainer2 = findRootSet.child;
        Threadable threadable2 = threadContainer2 != null ? threadContainer2.threadable : null;
        findRootSet.flush();
        return threadable2;
    }

    public Threadable thread(List<? extends Threadable> list) {
        return thread((Iterable<? extends Threadable>) list);
    }

    @Deprecated
    public Threadable thread(Threadable[] threadableArr) {
        if (threadableArr == null) {
            return null;
        }
        return thread(Arrays.asList(threadableArr));
    }
}
