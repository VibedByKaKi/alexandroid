package org.openjdk.tools.javac.api;

import java.util.Locale;
import java.util.Set;
import org.openjdk.javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface DiagnosticFormatter<D extends Diagnostic<?>> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Configuration {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum DiagnosticPart {
            SUMMARY,
            DETAILS,
            SOURCE,
            SUBDIAGNOSTICS,
            JLS
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MultilineLimit {
            DEPTH,
            LENGTH
        }

        int getMultilineLimit(MultilineLimit multilineLimit);

        Set<DiagnosticPart> getVisible();

        void setMultilineLimit(MultilineLimit multilineLimit, int i);

        void setVisible(Set<DiagnosticPart> set);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PositionKind {
        START,
        END,
        LINE,
        COLUMN,
        OFFSET
    }

    boolean displaySource(D d);

    String format(D d, Locale locale);

    String formatKind(D d, Locale locale);

    String formatMessage(D d, Locale locale);

    String formatPosition(D d, PositionKind positionKind, Locale locale);

    String formatSource(D d, boolean z, Locale locale);

    Configuration getConfiguration();
}
