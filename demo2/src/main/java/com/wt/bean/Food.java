package com.wt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @Getter 生成get方法
 * @Setter 生成set方法
 * @DAta 包含@ToString @EqualsAndHashCode
 * 所有属性的@Getter 所有non-final的@Setter @RequiredArgsConstructor
 *
 */

@Data
@AllArgsConstructor
public class Food {

    private String name;
    private Float price;
    private String[] sauce;

}
