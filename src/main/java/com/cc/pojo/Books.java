package com.cc.pojo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author caichengjie
 * @date 2020/7/16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
