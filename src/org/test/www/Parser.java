package org.test.www;

import java.util.Scanner;

public class Parser {
    private Scanner scanner;

    public Parser() {
        // �Ľ̿� �ʿ��� ��
        scanner = new Scanner(System.in);
    }

    public void start() {
        // �Է��� ����ؼ� �޵��� �ϱ� ���� ���� ����
        while(true) {
            print("��ǥ�� �Է��� �ּ���: ");

            String input = getInput();

            if(isExitCommand(input)) {
                print("��ǥ �Է��� �����մϴ�.");
                break;
            }

            if(isCoordinatePattern(input)) {
                Coordinate coordinate = toCoordinate(input);
                print("�Է��� ��ǥ�� " + coordinate + " �Դϴ�.");
            } else {
                // ��ǥ ������ �ƴ� ���
                print(input + " ��/�� �߸��� ��ǥ �����Դϴ�.");
            }
        }
    }

    void print(String message) {
        System.out.print(message);
    }

    String getInput() {
        return scanner.nextLine();
    }

    boolean isExitCommand(String input) {
        // ����� ���ڿ��� ���ϸ� �ǹǷ� String�� equals �޼��� ���
        // String�� equals�� ���ڰ� �������� ���ϵ��� �����Ǿ� �־��.
        return "����".equals(input);
    }

    boolean isCoordinatePattern(String input) {
        // ����ǥ���� ���� ����
        // \\d -> ���� 1�ڸ�: 0~9
        // + -> �տ� �� ���ڰ� 1�� �̻��� ���� �ǹ�
        // \\d+ -> ���ڰ� 1�� �̻�
        // , �޸��� �׳� �޸�
        // �����ϸ� \\d+,\\d+ �� ���� 1�� �̻� �޸� ���� 1�� �̻��̹Ƿ�
        // 123,456 ���� ��ǥ ������ ��쿡�� true�� ��

        // 1,1 -> true
        // 1, -> false
        // 11 -> false
        // 12345678,123987139821 -> true

        // ����(�����̽�)�� �Է��� ���� �����Ƿ�
        // �� ���� ���� �Է����� �����ϰ�, trim���� �ڸ�
        // + �� 1�� �̻��̾��ٸ�
        // * �� 0�� �̻�. �� �������� �ְ� ���� ���� ����
        // ����* �� �ǹ̴� ������ ���� ���� �ְ�, ���� ���� ����
        return input.matches(" *\\d+ *, *\\d+ *");
    }

    Coordinate toCoordinate(String input) {
        String[] splitted = input.split(",");

        // trim���� ������ �����ؼ� �ٽ� �迭�� ����
        splitted[0] = splitted[0].trim();
        splitted[1] = splitted[1].trim();

        // int Ÿ������ ��ȯ (parseInt �޼��� Ȱ��)
        // Integer.parseInt �޼���� ���ڹ��ڷ� ������ ���ڿ��� ���� Ÿ������ ��ȯ
        // "123" -> 123
        int x = Integer.parseInt(splitted[0]);
        int y = Integer.parseInt(splitted[1]);

        Coordinate coordinate = new Coordinate(x, y);
        return coordinate;
    }

    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.start();
    }
}

class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        // toString �޼��带 �������̵��ؼ� ����� �� ����� ����
        return "x=" + x + ", y=" + y;
    }
}