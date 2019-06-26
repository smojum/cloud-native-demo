package com.landsend.demoservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DemoObject {
    private Long id;
    private String message;
}
