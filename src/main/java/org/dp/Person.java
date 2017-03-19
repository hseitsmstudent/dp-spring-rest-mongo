package org.dp;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by student on 3/19/17.
 */
@Document
@Data
public class Person {
    @Id
    private String id;

    private String firstName;
    private String lastName;
}
