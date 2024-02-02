package com.example.mongo.user.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class EditUserRequest extends CreateUserRequest{
    private String id;
}
