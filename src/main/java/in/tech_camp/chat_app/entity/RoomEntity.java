package in.tech_camp.chat_app.entity;

import lombok.Data;

import java.util.List;

public class RoomEntity {
  private Integer id;
  private String name;
  private List<RoomUserEntity> roomUsers;
}
