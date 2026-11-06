package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class NewsgroupInfo {
    public static final int MODERATED_POSTING_PERMISSION = 1;
    public static final int PERMITTED_POSTING_PERMISSION = 2;
    public static final int PROHIBITED_POSTING_PERMISSION = 3;
    public static final int UNKNOWN_POSTING_PERMISSION = 0;
    private long estimatedArticleCount;
    private long firstArticle;
    private long lastArticle;
    private String newsgroup;
    private int postingPermission;

    @Deprecated
    public int getArticleCount() {
        return (int) this.estimatedArticleCount;
    }

    public long getArticleCountLong() {
        return this.estimatedArticleCount;
    }

    @Deprecated
    public int getFirstArticle() {
        return (int) this.firstArticle;
    }

    public long getFirstArticleLong() {
        return this.firstArticle;
    }

    @Deprecated
    public int getLastArticle() {
        return (int) this.lastArticle;
    }

    public long getLastArticleLong() {
        return this.lastArticle;
    }

    public String getNewsgroup() {
        return this.newsgroup;
    }

    public int getPostingPermission() {
        return this.postingPermission;
    }

    public void setArticleCount(long j) {
        this.estimatedArticleCount = j;
    }

    public void setFirstArticle(long j) {
        this.firstArticle = j;
    }

    public void setLastArticle(long j) {
        this.lastArticle = j;
    }

    public void setNewsgroup(String str) {
        this.newsgroup = str;
    }

    public void setPostingPermission(int i) {
        this.postingPermission = i;
    }
}
