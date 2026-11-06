package org.junit.experimental.theories;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class PotentialAssignment {
    public static PotentialAssignment forValue(final String str, final Object obj) {
        return new PotentialAssignment() { // from class: org.junit.experimental.theories.PotentialAssignment.1
            @Override // org.junit.experimental.theories.PotentialAssignment
            public String getDescription() {
                String m;
                Object obj2 = obj;
                if (obj2 == null) {
                    m = "null";
                } else {
                    try {
                        m = String.format("\"%s\"", obj2);
                    } catch (Throwable th) {
                        m = a$$ExternalSyntheticOutline0.m("[toString() threw ", th.getClass().getSimpleName(), ": ", th.getMessage(), MarkdownConstants.RIGHT_BRACKET);
                    }
                }
                return TableInfo$$ExternalSyntheticOutline0.m$1(m, " <from ", str, ">");
            }

            @Override // org.junit.experimental.theories.PotentialAssignment
            public Object getValue() {
                return obj;
            }

            public String toString() {
                return String.format("[%s]", obj);
            }
        };
    }

    public abstract String getDescription() throws CouldNotGenerateValueException;

    public abstract Object getValue() throws CouldNotGenerateValueException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CouldNotGenerateValueException extends Exception {
        private static final long serialVersionUID = 1;

        public CouldNotGenerateValueException() {
        }

        public CouldNotGenerateValueException(Throwable th) {
            super(th);
        }
    }
}
