package com.thetinydev.common;

import com.thetinydev.common.PageInfo;
import org.springframework.data.domain.Page;

public class PageUtils {

    public static PageInfo getPageInfo(Page<?> page) {
        PageInfo pagination = new PageInfo();
        pagination.setPageNumber(page.getNumber());
        pagination.setPageSize(page.getSize());
        pagination.setFirst(page.isFirst());
        pagination.setLast(page.isLast());
        pagination.setTotalPages(page.getTotalPages());
        pagination.setNumberOfElements(page.getNumberOfElements());
        pagination.setTotalElements(page.getTotalElements());
        pagination.setOffset(page.getPageable().getOffset());
        pagination.setSort(page.getSort());
        return pagination;
    }
}
