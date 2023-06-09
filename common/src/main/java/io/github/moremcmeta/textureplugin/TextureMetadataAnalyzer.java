package io.github.moremcmeta.textureplugin;

import io.github.moremcmeta.moremcmeta.api.client.metadata.AnalyzedMetadata;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataAnalyzer;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataView;

import java.util.Optional;

/**
 * Reads blur and clamp information from the given metadata.
 * @author soir20
 */
public class TextureMetadataAnalyzer implements MetadataAnalyzer {
    @Override
    public AnalyzedMetadata analyze(MetadataView metadata, int imageWidth, int imageHeight) {
        return new AnalyzedMetadata() {
            @Override
            public Optional<Boolean> blur() {
                return Optional.of(metadata.booleanValue("blur").orElse(false));
            }

            @Override
            public Optional<Boolean> clamp() {
                return Optional.of(metadata.booleanValue("clamp").orElse(false));
            }
        };
    }
}
