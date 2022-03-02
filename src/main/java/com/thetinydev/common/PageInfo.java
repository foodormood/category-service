package com.thetinydev.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo implements Serializable {
    int pageNumber;
    int pageSize;
    int numberOfElements;
    long totalElements;
    int totalPages;
    long offset;
    boolean first;
    boolean last;
    private Sort sort;
}
