package com.telkommedika.ListDokter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String username;
    @NotNull
    private String email;

}
