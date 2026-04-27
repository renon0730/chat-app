package in.tech_camp.chat_app.form;

import lombok.Data;

import java.util.List;

@Data
public class RoomForm {
  private String name;
  private List<Integer> memberIds;
}
