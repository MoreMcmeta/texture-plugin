package io.github.moremcmeta.textureplugin;

import com.google.common.collect.ImmutableMap;
import io.github.moremcmeta.moremcmeta.api.client.metadata.AnalyzedMetadata;
import io.github.moremcmeta.moremcmeta.api.client.metadata.InvalidMetadataException;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataAnalyzer;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataView;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the {@link TextureMetadataAnalyzer}.
 * @author soir20
 */
public class TextureMetadataAnalyzerTest {
    private static final MetadataAnalyzer ANALYZER = new TextureMetadataAnalyzer();

    @Test
    public void analyze_MissingBlur_DefaultsEmpty() throws InvalidMetadataException {
        MetadataView metadata = new MockMetadataView(ImmutableMap.of(
                "clamp", true
        ));

        AnalyzedMetadata result = ANALYZER.analyze(metadata, 100, 100);

        assertFalse(result.blur().isPresent());
    }

    @Test
    public void analyze_MissingClamp_DefaultsEmpty() throws InvalidMetadataException {
        MetadataView metadata = new MockMetadataView(ImmutableMap.of(
                "blur", true
        ));

        AnalyzedMetadata result = ANALYZER.analyze(metadata, 100, 100);

        assertFalse(result.clamp().isPresent());
    }

    @Test
    public void analyze_TrueBlur_IsTrue() throws InvalidMetadataException {
        MetadataView metadata = new MockMetadataView(ImmutableMap.of(
                "blur", true,
                "clamp", false
        ));

        AnalyzedMetadata result = ANALYZER.analyze(metadata, 100, 100);

        assertTrue(result.blur().orElseThrow());
    }

    @Test
    public void analyze_TrueClamp_IsTrue() throws InvalidMetadataException {
        MetadataView metadata = new MockMetadataView(ImmutableMap.of(
                "blur", false,
                "clamp", true
        ));

        AnalyzedMetadata result = ANALYZER.analyze(metadata, 100, 100);

        assertTrue(result.clamp().orElseThrow());
    }

    @Test
    public void analyze_FalseBlur_IsFalse() throws InvalidMetadataException {
        MetadataView metadata = new MockMetadataView(ImmutableMap.of(
                "blur", false,
                "clamp", true
        ));

        AnalyzedMetadata result = ANALYZER.analyze(metadata, 100, 100);

        assertFalse(result.blur().orElseThrow());
    }

    @Test
    public void analyze_FalseClamp_IsFalse() throws InvalidMetadataException {
        MetadataView metadata = new MockMetadataView(ImmutableMap.of(
                "blur", true,
                "clamp", false
        ));

        AnalyzedMetadata result = ANALYZER.analyze(metadata, 100, 100);

        assertFalse(result.clamp().orElseThrow());
    }

}