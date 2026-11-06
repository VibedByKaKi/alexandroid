package org.junit.rules;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TemporaryFolder extends ExternalResource {
    private File folder;
    private final File parentFolder;

    public TemporaryFolder(File file) {
        this.parentFolder = file;
    }

    private File createTemporaryFolderIn(File file) throws IOException {
        File createTempFile = File.createTempFile("junit", "", file);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    private boolean isLastElementInArray(int i, String[] strArr) {
        return i == strArr.length - 1;
    }

    private void recursiveDelete(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    private void validateFolderName(String str) throws IOException {
        if (new File(str).getParent() == null) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders");
    }

    @Override // org.junit.rules.ExternalResource
    public void after() {
        delete();
    }

    @Override // org.junit.rules.ExternalResource
    public void before() throws Throwable {
        create();
    }

    public void create() throws IOException {
        this.folder = createTemporaryFolderIn(this.parentFolder);
    }

    public void delete() {
        File file = this.folder;
        if (file != null) {
            recursiveDelete(file);
        }
    }

    public File getRoot() {
        File file = this.folder;
        if (file != null) {
            return file;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("the temporary folder has not yet been created");
        return null;
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("a file with the name '", str, "' already exists in the test folder"));
        return null;
    }

    public File newFolder(String... strArr) throws IOException {
        File root = getRoot();
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            validateFolderName(str);
            File file = new File(root, str);
            if (!file.mkdir() && isLastElementInArray(i, strArr)) {
                Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("a folder with the name '", str, "' already exists"));
                return null;
            }
            i++;
            root = file;
        }
        return root;
    }

    public TemporaryFolder() {
        this(null);
    }

    public File newFile() throws IOException {
        return File.createTempFile("junit", null, getRoot());
    }

    public File newFolder(String str) throws IOException {
        return newFolder(str);
    }

    public File newFolder() throws IOException {
        return createTemporaryFolderIn(getRoot());
    }
}
