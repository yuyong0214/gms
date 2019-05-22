package com.yong.gmsorder.entity;

    import java.time.LocalDateTime;
    import java.util.Date;

    import lombok.*;
    import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders{
    @Id
    private Long id;

    private String orderNo;

    private String productNo;

    private Date createTime;
}
