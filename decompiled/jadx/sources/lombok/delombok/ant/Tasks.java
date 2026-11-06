package lombok.delombok.ant;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class Tasks {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Delombok extends Task {
        private static ClassLoader shadowLoader;
        private Path classpath;
        private String encoding;
        private List<Format> formatOptions = new ArrayList();
        private File fromDir;
        private Path modulepath;
        private Path path;
        private Path sourcepath;
        private File toDir;
        private boolean verbose;

        public static Class<?> shadowLoadClass(String str) {
            try {
                if (shadowLoader == null) {
                    try {
                        Class.forName("lombok.core.LombokNode");
                        shadowLoader = Delombok.class.getClassLoader();
                    } catch (ClassNotFoundException unused) {
                        Method declaredMethod = Class.forName("lombok.launch.Main").getDeclaredMethod("getShadowClassLoader", null);
                        declaredMethod.setAccessible(true);
                        shadowLoader = (ClassLoader) declaredMethod.invoke(null, null);
                    }
                }
                return Class.forName(str, true, shadowLoader);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                Buffer$$ExternalSyntheticBUOutline0.m(th);
                return null;
            }
        }

        public void addFileset(FileSet fileSet) {
            if (this.path == null) {
                this.path = new Path(getProject());
            }
            this.path.add(fileSet);
        }

        public void addFormat(Format format) {
            this.formatOptions.add(format);
        }

        public Path createClasspath() {
            if (this.classpath == null) {
                this.classpath = new Path(getProject());
            }
            return this.classpath.createPath();
        }

        public Path createModulepath() {
            if (this.modulepath == null) {
                this.modulepath = new Path(getProject());
            }
            return this.modulepath.createPath();
        }

        public Path createSourcepath() {
            if (this.sourcepath == null) {
                this.sourcepath = new Path(getProject());
            }
            return this.sourcepath.createPath();
        }

        public void execute() throws BuildException {
            Location location = getLocation();
            try {
                Object newInstance = shadowLoadClass("lombok.delombok.ant.DelombokTaskImpl").getConstructor(null).newInstance(null);
                for (Field field : getClass().getDeclaredFields()) {
                    if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                        Field declaredField = newInstance.getClass().getDeclaredField(field.getName());
                        declaredField.setAccessible(true);
                        if (field.getName().equals("formatOptions")) {
                            ArrayList arrayList = new ArrayList();
                            for (Format format : this.formatOptions) {
                                if (format.getValue() == null) {
                                    throw new BuildException("'value' property required for <format>");
                                }
                                arrayList.add(format.getValue());
                            }
                            declaredField.set(newInstance, arrayList);
                        } else {
                            declaredField.set(newInstance, field.get(this));
                        }
                    }
                }
                newInstance.getClass().getMethod("execute", Location.class).invoke(newInstance, location);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                Buffer$$ExternalSyntheticBUOutline0.m(th);
            }
        }

        public void setClasspath(Path path) {
            Path path2 = this.classpath;
            if (path2 == null) {
                this.classpath = path;
            } else {
                path2.append(path);
            }
        }

        public void setClasspathRef(Reference reference) {
            createClasspath().setRefid(reference);
        }

        public void setEncoding(String str) {
            this.encoding = str;
        }

        public void setFrom(File file) {
            this.fromDir = file;
        }

        public void setModulepath(Path path) {
            Path path2 = this.modulepath;
            if (path2 == null) {
                this.modulepath = path;
            } else {
                path2.append(path);
            }
        }

        public void setModulepathRef(Reference reference) {
            createModulepath().setRefid(reference);
        }

        public void setSourcepath(Path path) {
            Path path2 = this.sourcepath;
            if (path2 == null) {
                this.sourcepath = path;
            } else {
                path2.append(path);
            }
        }

        public void setSourcepathRef(Reference reference) {
            createSourcepath().setRefid(reference);
        }

        public void setTo(File file) {
            this.toDir = file;
        }

        public void setVerbose(boolean z) {
            this.verbose = z;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Format {
        private String value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.value;
            String str2 = ((Format) obj).value;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public void setValue(String str) {
            this.value = str;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("FormatOption [value="), this.value, MarkdownConstants.RIGHT_BRACKET);
        }
    }
}
