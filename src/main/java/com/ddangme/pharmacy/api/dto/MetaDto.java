package com.ddangme.pharmacy.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {

    /*
    @JsonProperty: Jackson 라이브러리에서 사용되는 어노테이션으로, Java 객체의 필드와 JSON 속성을 매핑할 때 사용한다.

    일반적으로 Java 클래스의 필드 이름과 JSON 데이터의 키 이름이 다를 경우에 사용한다.
    예를 들어, Java 클래스의 이름이 'totalCount' 이지만 해당 필드가 JSON 데이터에서 'total_count' 키에 매핑되어야 하는 경우 유용하게 사용된다.

    이렇게 함으로써 Jackson 은 JSON 데이터를 JAVA 객체로 변환할 때 해당 JSON 키를 사용하여 필드에 값을 매핑하거나, Java 객체를 JSON 으로 직렬화 할 때 해당 필드를 해당 JOSN 키로 변환한다.
     */
    @JsonProperty("total_count")
    private Integer totalCount;

}
