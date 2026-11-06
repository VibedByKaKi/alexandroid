package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.client.alexaservice.audio.events.SpeechmarkUnsupportedMP3FrameEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaSpeechmarkParser implements SpeechmarkParser {
    private final AlexaClientEventBus eventBus;
    private final SpeechmarkId3Parser id3Parser;
    private final WakeWordOccurrenceNotifier wakeWordOccurrenceNotifier;
    private final Pattern wakeWordPattern = Pattern.compile(Constants.WW_REGEX, 2);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Constants {
        static final int HEADER_IDENTIFIER_SIZE = 3;
        static final int MP3_TYPE_INDEX = 2;
        static final int MPEG_16000_HZ_FRAME_LENGTH = 216;
        static final int MPEG_22050_HZ_FRAME_LENGTH = 156;
        static final int MPEG_24000_HZ_FRAME_LENGTH = 144;
        static final int MPEG_PADDING_LENGTH = 1;
        static final String NON_ALPHANUMERIC_SPACE = "[^a-zA-Z\\d\\s:\\u00C0-\\u00FF]";
        static final String SPEECHMARK_ATTRIBUTE = "word";
        static final String WAKEWORD = "alexa";
        static final byte[] ID3_BYTES = "ID3".getBytes();
        static final byte[] MP3_BYTES = {-1, -13};
        static final String WW_REGEX = "\\b[^a-zA-Z\\d\\s:\\u00C0-\\u00FF]*alexa[^a-zA-Z\\d\\s:\\u00C0-\\u00FF]*\\b";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Mp3HeaderType {
        static final int SAMPLE_RATE_16000_HZ = 104;
        static final int SAMPLE_RATE_22050_HZ_WITHOUT_PADDING = 96;
        static final int SAMPLE_RATE_22050_HZ_WITH_PADDING = 98;
        static final int SAMPLE_RATE_24000_HZ = 100;
    }

    @Inject
    public AlexaSpeechmarkParser(SpeechmarkId3Parser speechmarkId3Parser, WakeWordOccurrenceNotifier wakeWordOccurrenceNotifier, AlexaClientEventBus alexaClientEventBus) {
        this.id3Parser = speechmarkId3Parser;
        this.wakeWordOccurrenceNotifier = wakeWordOccurrenceNotifier;
        this.eventBus = alexaClientEventBus;
    }

    private boolean checkHeader(byte[] bArr, byte[] bArr2) throws IOException {
        if (bArr.length < bArr2.length) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Phrase length is invalid");
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isId3Header(byte[] bArr) throws IOException {
        return checkHeader(bArr, Constants.ID3_BYTES);
    }

    private boolean isMp3Header(byte[] bArr) throws IOException {
        return checkHeader(bArr, Constants.MP3_BYTES);
    }

    private void notifySpeechMarks(List<Speechmark> list, AttachmentIdentifier attachmentIdentifier) {
        for (Speechmark speechmark : list) {
            if (speechmark.type.equals("word") && this.wakeWordPattern.matcher(speechmark.value).find()) {
                this.wakeWordOccurrenceNotifier.notify(attachmentIdentifier, speechmark.time);
            }
        }
    }

    private void skipAudioData(byte b, SpeechmarkDataSource speechmarkDataSource) throws IOException {
        if (b == 96) {
            speechmarkDataSource.skipAudioData(156);
            return;
        }
        if (b == 98) {
            speechmarkDataSource.skipAudioData(157);
            return;
        }
        if (b == 100) {
            speechmarkDataSource.skipAudioData(144);
        } else if (b == 104) {
            speechmarkDataSource.skipAudioData(JfifUtil.MARKER_SOI);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Unknown mp3 frame header type");
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkParser
    public void parse(SpeechmarkDataSource speechmarkDataSource, AttachmentIdentifier attachmentIdentifier) throws IOException {
        while (speechmarkDataSource.isAvailable()) {
            byte[] bArr = new byte[3];
            speechmarkDataSource.mark();
            speechmarkDataSource.readBytes(bArr, 3);
            speechmarkDataSource.reset();
            if (isId3Header(bArr)) {
                notifySpeechMarks(this.id3Parser.parse(speechmarkDataSource), attachmentIdentifier);
            } else {
                if (!isMp3Header(bArr)) {
                    this.eventBus.post(SpeechmarkUnsupportedMP3FrameEvent.create());
                    Buffer$$ExternalSyntheticBUOutline0.m$2("Unsupported mp3 frame");
                    return;
                }
                skipAudioData(bArr[2], speechmarkDataSource);
            }
        }
    }
}
