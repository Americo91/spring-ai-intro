package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponse(@JsonPropertyDescription("This is the city name") String city,
                                 @JsonPropertyDescription("The population of the city") String population,
                                 @JsonPropertyDescription("The primary language spoken") String language,
                                 @JsonPropertyDescription("The currency used") String currency
) {
}
