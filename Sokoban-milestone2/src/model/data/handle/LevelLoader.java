package level;

import java.io.IOException;
import java.io.InputStream;

/**
 * <h1>Level Saver interface</h1>
 * defines the behavior that all the level saver needs to implement
 * <p dir=rtl> �. ����� ���� ������ �� �������� �� ���� �����, ����� ����� ����� ������� ������� ���� ���- ����� �����.�� ���� ���� ����� ���, ����� ��� ���� ����� ��� ������� ������� �� ����� ����. </p>
 * <p dir=rtl> �.����� �� ������ ����� �� ������ �-open/close  �� ������ ����� ����� ��� ����� ����� ����� ���� ����� ���, ��� ����� ���� �����. ��� ��� ����� ������ ����� ���� ����� ������ ��, ����� �� ������ ������� �LevelLoader �����. </p>
 * <p dir=rtl> �. ������ ������ �� ������ �� ���� ����� ������ ��, ����� ����� ���� ����� ���, ��� ������ ���� �����, ����� �������� ���� LevelLoader ���� ������ �� �� ��� ���, ���, ������ �� ����� �load. ��� ��� ���� ���� downcasting ��� ��� �����, �� �� �� ����� �� levelLoader ������ ���� �� ����� �load. </p>
 * <p dir=rtl> �. ����� ������ �InputStream ���� ����� ����� ��� ���� ��� �����- ��� ����� �����. </p>
 */

public interface LevelLoader {
	
	public Level loadLevel(InputStream file) throws IOException, ClassNotFoundException;
	
}
