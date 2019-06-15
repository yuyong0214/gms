package com.yong.gmsorder.entity;

    import java.util.Date;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders{
    @TableId(type = IdType.AUTO)
    private Long id;

    private String orderNo;

    private String productNo;

    private Date createTime;

    private Integer purchase;
}
