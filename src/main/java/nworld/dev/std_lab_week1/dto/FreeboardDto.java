package nworld.dev.std_lab_week1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class FreeboardDto {

    public static class Request {
        @Getter
        @NoArgsConstructor
        public static class Post {
            private String title;
            private String content;
            private String writer;
        }

        @Getter
        @NoArgsConstructor
        public static class Patch {
            private Long postId;
            private String title;
            private String content;
            private String writer;
        }
    }
}
