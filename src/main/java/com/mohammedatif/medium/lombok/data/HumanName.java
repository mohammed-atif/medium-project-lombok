package com.mohammedatif.medium.lombok.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HumanName {
    private String firstName;
    private String lastName;
}
