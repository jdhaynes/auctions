/*
  Warnings:

  - You are about to alter the column `reservePrice` on the `Auction` table. The data in that column could be lost. The data in that column will be cast from `BigInt` to `Integer`.
  - You are about to alter the column `soldAmount` on the `Auction` table. The data in that column could be lost. The data in that column will be cast from `BigInt` to `Integer`.
  - You are about to alter the column `currentHighBid` on the `Auction` table. The data in that column could be lost. The data in that column will be cast from `BigInt` to `Integer`.

*/
-- AlterTable
ALTER TABLE "Auction" ALTER COLUMN "reservePrice" SET DATA TYPE INTEGER,
ALTER COLUMN "soldAmount" SET DATA TYPE INTEGER,
ALTER COLUMN "currentHighBid" SET DATA TYPE INTEGER;
