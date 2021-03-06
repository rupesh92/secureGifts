package com.ekarth.model;

import com.ekarth.model.annotations.PrimaryKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @PrimaryKey
    int categoryId;
    String name;
    int companyId;

}
