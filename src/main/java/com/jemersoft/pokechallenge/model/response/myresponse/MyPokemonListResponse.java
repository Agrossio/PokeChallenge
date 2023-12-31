package com.jemersoft.pokechallenge.model.response.myresponse;

import com.jemersoft.pokechallenge.model.response.apiresponse.ApiPokemon;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.stream.Collectors;

// Builder con herencia: https://www.baeldung.com/lombok-builder-inheritance
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MyPokemonListResponse {
    private String name;
    private String imageUrl;
    private List<String> type;
    private double weight;
    private List<String> abilities;

    public static List<MyPokemonListResponse> toResponse(List<ApiPokemon> apiPokemonList) {

        return apiPokemonList.stream()
                .map(apiPokemon -> MyPokemonListResponse.builder()
                                        .name(apiPokemon.getName())
                                        .imageUrl(apiPokemon.getImageUrl())
                                        .type(apiPokemon.getTypes())
                                        .weight(apiPokemon.getWeight())
                                        .abilities(apiPokemon.getAbilities())
                                        .build())
                .collect(Collectors.toList());
    }
}
