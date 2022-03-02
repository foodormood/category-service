package com.thetinydev.common;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

@Data
public class Response<T> implements Serializable {

  private List<T> data;
  private PageInfo pagination;

  private long timestamp = System.currentTimeMillis();

  public static <T> Response<T> toPage(Page<T> data) {
    Response<T> r = new  Response<T>();
    r.setData(data.getContent());
    r.setPagination(PageUtils.getPageInfo(data));
    return r;
  }
}
