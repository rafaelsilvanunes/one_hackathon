package br.com.oracleone.sentimentapi.domain;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Resposta da análise de sentimento")
public record SentimentResponse(
        @Schema(description = "Classificação do sentimento", example = "Positivo", allowableValues = {"Positivo", "Negativo", "Neutro"})
        String previsao,
        @Schema(description = "Probabilidade da classificação (0.0 a 1.0)", example = "0.87")
        double probabilidade
) {}